package net.lab1024.smartadmin.module.business.label.domain.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import net.lab1024.smartadmin.common.domain.PageParamDTO;

import java.util.Date;

/**
 * [ 牡丹花 ]
 *
 * @author 卓大
 * @version 1.0
 * @company 1024创新实验室( www.1024lab.net )
 * @copyright (c)  1024创新实验室( www.1024lab.net )Inc. All rights reserved.
 * @date 2020-04-06 18:17:56
 * @since JDK1.8
 */
@Data
public class LabelProjectQueryDTO extends PageParamDTO {

    @ApiModelProperty("projectID")
    private String projectId;

    @ApiModelProperty("任务名称")
    private String projectName;

    @ApiModelProperty("创建时间-开始")
    private Date createTimeBegin;

    @ApiModelProperty("创建时间-截止")
    private Date createTimeEnd;
}
