package cn.sx.ebj.bidding.controller;

import cn.sx.ebj.bidding.core.base.IController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @name: 供应商注册控制器
 * @author: chunjie
 * @date: 2022-12-18 19:57
 **/

@Controller
@RequestMapping("/reg")
public class RegisterController extends IController {

    @GetMapping("/")
    public String  index(){

        return "reg/index";
    }
}
