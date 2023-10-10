package com.chunjies.bidding.controller.project;

import com.chunjies.bidding.common.base.IController;
import com.chunjies.bidding.common.base.Result;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @name: 项目管理模块
 * @author: chunjie
 * @date: 2022-11-16 22:49
 **/
@RestController
@RequestMapping("/project")
public class ProjectManger extends IController {
    @RequestMapping("/list")
    public Result<String> projectList(ModelMap map) {

        return Result.FAIL("请求失败");
    }
}
