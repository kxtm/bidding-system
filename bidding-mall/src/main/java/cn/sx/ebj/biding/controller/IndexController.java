package cn.sx.ebj.biding.controller;

import cn.sx.ebj.bidding.common.core.IController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;

/**
 * @name: indexController
 * @author: chunjie
 * @date: 2022-11-16 22:39
 **/
@Controller
public class IndexController extends IController {

    @GetMapping(value = {"","/"})
    public String index(ModelMap map, HttpSession session) {

        map.addAttribute("aa",session.getAttribute("aa"));

        return "index";
    }
}
