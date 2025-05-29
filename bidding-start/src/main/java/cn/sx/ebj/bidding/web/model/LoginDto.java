package cn.sx.ebj.bidding.web.model;

import cn.sx.ebj.bidding.core.consts.Constr;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;


public class LoginDto {

    @NotBlank(message = "用户名不能为空")
    @Pattern(regexp = Constr.REGEXP_LOGIN_NAME,message = "用户名格式不正确")
    private String loginName;

    @NotBlank(message = "密码不能为空")
    private String loginPwd;
    @NotBlank(message = "验证码不能为空")
    private String loginCode;

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getLoginPwd() {
        return loginPwd;
    }

    public void setLoginPwd(String loginPwd) {
        this.loginPwd = loginPwd;
    }

    public String getLoginCode() {
        return loginCode;
    }

    public void setLoginCode(String loginCode) {
        this.loginCode = loginCode;
    }
}
