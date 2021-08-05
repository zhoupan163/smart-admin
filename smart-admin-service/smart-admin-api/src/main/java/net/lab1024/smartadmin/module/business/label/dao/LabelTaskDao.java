package net.lab1024.smartadmin.module.business.label.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import net.lab1024.smartadmin.module.business.label.domain.dto.LabelProjectQueryDTO;
import net.lab1024.smartadmin.module.business.label.domain.dto.LabelTaskQueryDTO;
import net.lab1024.smartadmin.module.business.label.domain.entity.LabelProjectEntity;
import net.lab1024.smartadmin.module.business.label.domain.vo.LabelProjectVO;
import net.lab1024.smartadmin.module.business.label.domain.vo.LabelTaskVO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface LabelTaskDao extends BaseMapper<LabelProjectEntity> {
    /**
     * 分页查询
     * @param queryDTO
     * @return LabelTask
     */
    public IPage<LabelTaskVO> queryByPage(Page page, LabelTaskQueryDTO queryDTO);
}
