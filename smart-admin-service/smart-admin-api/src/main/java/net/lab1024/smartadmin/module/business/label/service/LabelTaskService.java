package net.lab1024.smartadmin.module.business.label.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import net.lab1024.smartadmin.common.domain.PageResultDTO;
import net.lab1024.smartadmin.common.domain.ResponseDTO;

import net.lab1024.smartadmin.module.business.label.dao.LabelTaskDao;
import net.lab1024.smartadmin.module.business.label.domain.dto.LabelTaskQueryDTO;
import net.lab1024.smartadmin.module.business.label.domain.entity.LabelTaskDetail;
import net.lab1024.smartadmin.module.business.label.domain.vo.LabelTaskVO;
import net.lab1024.smartadmin.util.SmartPageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LabelTaskService {
    @Autowired
    private LabelTaskDao labelTaskDao;

    @Autowired
    private MongoTemplate mongoTemplate;

    public ResponseDTO<PageResultDTO<LabelTaskVO>> queryByPage(LabelTaskQueryDTO queryDTO) {
        Page page = SmartPageUtil.convert2QueryPage(queryDTO);
        IPage<LabelTaskVO> voList = labelTaskDao.queryByPage(page, queryDTO);
        PageResultDTO<LabelTaskVO> pageResultDTO = SmartPageUtil.convert2PageResult(voList);
        return ResponseDTO.succData(pageResultDTO);
    }

    public ResponseDTO<LabelTaskDetail> queryTaskDetail(String taskId) {
        Query query=Query.query(Criteria.where("taskId").is(taskId));
        List<LabelTaskDetail> list=mongoTemplate.find(query, LabelTaskDetail.class);
        //LabelTaskDetail labelTaskDetail= list.get(0);
        //System.out.println("succ");
        return ResponseDTO.succData(list.get(0));
    }
}
