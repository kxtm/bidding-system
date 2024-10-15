package cn.sx.ebj.bidding.core.enums;

//异常类型
public enum BizMsgType {
    SYS_ERROR("9999","系统错误"),PARAM_ERROR("9998","参数不能为空");
    private String code;
    private String msg;

    BizMsgType(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg.concat("(").concat(getCode()).concat(")");
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
