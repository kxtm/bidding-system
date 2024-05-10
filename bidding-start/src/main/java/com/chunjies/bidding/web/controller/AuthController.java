package com.chunjies.bidding.web.controller;

import com.chunjies.bidding.common.core.IController;
import com.chunjies.bidding.common.core.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * {@code @name:} MangerController
 * {@code @author:} chunjie
 * {@code @date:} 2022-11-19 21:21
 **/
@RestController
@RequestMapping("/auth")
public class AuthController extends IController {

    @GetMapping("/")
    public Result<String> access() {
        return Result.error("请求错误");
    }
}
