package cn.sx.ebj.bidding.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.WebRequest;

@Controller
public class IndexController {

    @GetMapping(value = {"", "/"})
    public String index(WebRequest req) {
        req.setAttribute("name", "1111", RequestAttributes.SCOPE_REQUEST);
        return "index";
    }
}
