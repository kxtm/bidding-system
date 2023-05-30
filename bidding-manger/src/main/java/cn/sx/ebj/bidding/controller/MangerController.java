package cn.sx.ebj.bidding.controller;

import cn.sx.ebj.bidding.common.core.IController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @name: MangerController
 * @author: chunjie
 * @date: 2022-11-19 21:21
 **/
@Controller
@RequestMapping("/gl")
public class MangerController extends IController {

    @GetMapping("/")
    public String access(){
        return "manger/login";
    }
}
