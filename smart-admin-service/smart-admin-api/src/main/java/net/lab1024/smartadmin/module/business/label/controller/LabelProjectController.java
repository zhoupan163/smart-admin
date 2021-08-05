package net.lab1024.smartadmin.module.business.label.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import net.lab1024.smartadmin.common.domain.PageResultDTO;
import net.lab1024.smartadmin.common.domain.ResponseDTO;
import net.lab1024.smartadmin.module.business.label.domain.dto.LabelProjectQueryDTO;
import net.lab1024.smartadmin.module.business.label.domain.vo.LabelProjectVO;
import net.lab1024.smartadmin.module.business.label.service.LabelProjectService;
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
 * @date 2021-08-03 16:24:33
 * @since JDK1.8
 */
@RestController
@Api(tags = {"标注项目"})
public class LabelProjectController {
    @Autowired
    private LabelProjectService labelProjectService;

    @ApiOperation(value = "分页查询任务",notes = "@author zhoup")
    @PostMapping("/labelProject/page/query")
    public ResponseDTO<PageResultDTO<LabelProjectVO>> queryByPage(@RequestBody LabelProjectQueryDTO queryDTO) {

        ResponseDTO<PageResultDTO<LabelProjectVO>> data=labelProjectService.queryByPage(queryDTO);
        return data;
    }
}
