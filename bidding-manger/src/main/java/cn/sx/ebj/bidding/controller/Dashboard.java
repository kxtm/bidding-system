package cn.sx.ebj.bidding.controller;

import cn.sx.ebj.bidding.core.annotation.SysLog;
import cn.sx.ebj.bidding.core.base.IController;
import cn.sx.ebj.bidding.core.enums.Modules;
import cn.sx.ebj.bidding.core.enums.OperType;
import cn.sx.ebj.bidding.core.utils.ConvertUtil;
import cn.sx.ebj.bidding.core.utils.Page;
import cn.sx.ebj.bidding.core.utils.Result;
import cn.sx.ebj.bidding.model.UserModel;
import cn.sx.ebj.bidding.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.WebRequest;

import javax.servlet.http.HttpSession;

@Controller
public class Dashboard extends IController {


    private IUserService userService;

    @GetMapping(value = {"", "/"})
    @SysLog(module = Modules.CGGL, func = "首页", desc = "首页", type = OperType.QUERY)
    public String index(WebRequest request, HttpSession session) {
        session.setAttribute("aa", "22");
        log.info("首页->{}", ConvertUtil.toStr(null));
        request.setAttribute("b", "11", RequestAttributes.SCOPE_REQUEST);
        UserModel userModel = userService.getUserByName("1");
        return "index";
    }

    @GetMapping("test")
    @ResponseBody
    public Result<String> getIndex() {
        Page<Object> d = Page.init();
        d.setTotalRecord(65);
        return Result.SUCCESS(d.getTotalPage() + "");
    }


    @Autowired
    public void setUserService(IUserService userService) {
        this.userService = userService;
    }
}
