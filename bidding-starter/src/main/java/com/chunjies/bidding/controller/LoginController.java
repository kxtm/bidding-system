package com.chunjies.bidding.controller;

import com.chunjies.bidding.common.base.IController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @name: MangerController
 * @author: chunjie
 * @date: 2022-11-19 21:21
 **/
@RestController
@RequestMapping("/auth")
public class LoginController extends IController {

    @GetMapping("/")
    public String access(){
        return "manger/login";
    }
}
