package net.lab1024.smartadmin.module.business.label.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import net.lab1024.smartadmin.common.domain.PageResultDTO;
import net.lab1024.smartadmin.common.domain.ResponseDTO;
import net.lab1024.smartadmin.module.business.label.domain.dto.LabelProjectQueryDTO;
import net.lab1024.smartadmin.module.business.label.domain.dto.LabelTaskQueryDTO;
import net.lab1024.smartadmin.module.business.label.domain.entity.LabelTaskDetail;
import net.lab1024.smartadmin.module.business.label.domain.vo.LabelProjectVO;
import net.lab1024.smartadmin.module.business.label.domain.vo.LabelTaskVO;
import net.lab1024.smartadmin.module.business.label.service.LabelProjectService;
import net.lab1024.smartadmin.module.business.label.service.LabelTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * [ 标注任务 ]
 *
 * @author zhoup
 * @version 1.0
 * @company pxing
 * @copyright (c) ww. All rights reserved.
 * @date 2021-08-04 13:33:15
 * @since JDK1.8
 */
@RestController
@Api(tags = {"标注任务"})
public class LabelTaskController {
    @Autowired
    private LabelTaskService labelTaskService;

    @ApiOperation(value = "分页查询任务",notes = "@author zhoup")
    @PostMapping("/labelTask/page/query")
    public ResponseDTO<PageResultDTO<LabelTaskVO>> queryByPage(@RequestBody LabelTaskQueryDTO queryDTO) {

        ResponseDTO<PageResultDTO<LabelTaskVO>> data=labelTaskService.queryByPage(queryDTO);
        return data;
    }

    @ApiOperation(value = "分页查询任务",notes = "@author zhoup")
    @PostMapping("/labelTask/task/query")
    public ResponseDTO<LabelTaskDetail> queryByPage(@RequestBody String  taskId) {

        ResponseDTO<LabelTaskDetail> data=labelTaskService.queryTaskDetail(taskId);
        return data;
    }

}
