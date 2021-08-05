package net.lab1024.smartadmin.module.business.label.domain.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;



/**
 * [ 标注任务 ]
 *
 * @author zhoup
 * @version 1.0
 * @company pxing
 * @copyright (c) ww. All rights reserved.
 * @date 2021-08-03 16:03:19
 * @since JDK1.8
 */
@Data
public class LabelProjectVO {
    @ApiModelProperty("工程ID")
    private String projectId;

    @ApiModelProperty("工程名称")
    private String projectName;

    @ApiModelProperty("创建时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private String createTime;

    @ApiModelProperty("工程任务数量")
    private Long taskSize;

    @ApiModelProperty("图片数量")
    private Long imageSize;

    @ApiModelProperty("工程状态")
    private Long status;



}
