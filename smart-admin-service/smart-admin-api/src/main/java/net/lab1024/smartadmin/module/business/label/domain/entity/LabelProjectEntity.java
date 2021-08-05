package net.lab1024.smartadmin.module.business.label.domain.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import net.lab1024.smartadmin.common.domain.BaseEntity;

/**
 * [ 标注任务 ]
 *
 * @author zhoup
 * @version 1.0
 * @company pxing
 * @copyright (c) ww. All rights reserved.
 * @date 2021-08-03 15:51:19
 * @since JDK1.8
 */
@Data
@TableName("px_db_da_project")
public class LabelProjectEntity extends BaseEntity{

    private String taskId;

    private String taskName;

    private Long bagSize;

    private Long imageSize;

    private Long status;

}
