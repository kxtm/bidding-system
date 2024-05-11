package com.chunjies.bidding.web.controller;

import com.chunjies.bidding.common.core.IController;
import com.chunjies.bidding.common.core.Result;
import com.chunjies.bidding.web.model.LoginDto;
import com.chunjies.bidding.web.service.IUserFace;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * {@code @name:} MangerController
 * {@code @author:} chunjie
 * {@code @date:} 2022-11-19 21:21
 **/
@RestController
@RequestMapping("/auth")
public class AuthController extends IController {

    IUserFace userFace;

    @GetMapping("/login")
    @Valid
    public Result<String> login(@RequestBody LoginDto loginInfo) {
        log.error("aaaa");
        return Result.error("请求错误");
    }

    @GetMapping("/test")
    public Result<String> test() {
        userFace.getUserByName("11");
        return Result.error();
    }


    @Autowired
    public void setUserFace(IUserFace userFace) {
        this.userFace = userFace;
    }
}
