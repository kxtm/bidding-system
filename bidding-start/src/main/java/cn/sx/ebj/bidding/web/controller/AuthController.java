package cn.sx.ebj.bidding.web.controller;

import cn.sx.ebj.bidding.core.base.IController;
import cn.sx.ebj.bidding.core.base.Result;
import cn.sx.ebj.bidding.web.face.IUserFace;
import cn.sx.ebj.bidding.web.model.LoginDto;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

    IUserFace userFace;

    @GetMapping("/login")
    @Valid
    public Result<String> login(@RequestBody LoginDto loginInfo) {
        log.error("aaaa");
        return Result.error("请求错误");
    }

    @GetMapping("/test")
    public Result<String> test() {
       // throw new RuntimeException("test");

        LoginDto loginDto = userFace.getUserByName("11");
        return Result.error(loginDto.getLoginName());
    }


    @Autowired
    public void setUserFace(IUserFace userFace) {
        this.userFace = userFace;
    }
}
