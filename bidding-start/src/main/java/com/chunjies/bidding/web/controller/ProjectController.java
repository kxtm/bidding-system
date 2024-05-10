package com.chunjies.bidding.web.controller;

import com.chunjies.bidding.common.core.IController;
import com.chunjies.bidding.common.core.Result;
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
public class ProjectController extends IController {
    @RequestMapping("/list")
    public Result<String> projectList(ModelMap map) {

        return Result.error("请求失败");
    }
}
