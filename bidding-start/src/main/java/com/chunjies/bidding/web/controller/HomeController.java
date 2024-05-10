package com.chunjies.bidding.web.controller;

import com.chunjies.bidding.common.annotation.SysLog;
import com.chunjies.bidding.common.core.IController;
import com.chunjies.bidding.common.enums.Modules;
import com.chunjies.bidding.common.enums.OperType;
import com.chunjies.bidding.common.utils.Converts;
import com.chunjies.bidding.common.utils.Page;
import com.chunjies.bidding.common.core.Result;
import com.chunjies.bidding.web.model.UserModel;
import com.chunjies.bidding.web.service.IUserFace;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.WebRequest;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/dashboard")
public class HomeController extends IController {


    private IUserFace userFace;

    @GetMapping(value = {"", "/"})
    @SysLog(module = Modules.CGGL, func = "首页", desc = "首页", type = OperType.QUERY)
    public String index(WebRequest request, HttpSession session) {
        session.setAttribute("aa", "22");
        log.info("首页->{}", Converts.toStr(null));
        request.setAttribute("b", "11", RequestAttributes.SCOPE_REQUEST);
        UserModel userModel = userFace.getUserByName("1");
        return "index";
    }

    @GetMapping("test")
    @ResponseBody
    public Result<String> getIndex() {
        Page<?> d = Page.init();
        d.setTotalRecord(65);
        return Result.ok(d.getTotalPage() + "");
    }

    @Autowired
    public void setUserFace(IUserFace userFace) {
        this.userFace = userFace;
    }
}
