package net.lab1024.smartadmin.module.business.label.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import net.lab1024.smartadmin.common.domain.PageResultDTO;
import net.lab1024.smartadmin.common.domain.ResponseDTO;
import net.lab1024.smartadmin.module.business.label.dao.LabelProjectDao;
import net.lab1024.smartadmin.module.business.label.domain.dto.LabelProjectQueryDTO;
import net.lab1024.smartadmin.module.business.label.domain.vo.LabelProjectVO;
import net.lab1024.smartadmin.util.SmartPageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LabelProjectService {
    @Autowired
    private LabelProjectDao labelTaskDao;
    public ResponseDTO<PageResultDTO<LabelProjectVO>> queryByPage(LabelProjectQueryDTO queryDTO) {
        Page page = SmartPageUtil.convert2QueryPage(queryDTO);
        IPage<LabelProjectVO> voList = labelTaskDao.queryByPage(page, queryDTO);
        PageResultDTO<LabelProjectVO> pageResultDTO = SmartPageUtil.convert2PageResult(voList);
        return ResponseDTO.succData(pageResultDTO);
    }
}
