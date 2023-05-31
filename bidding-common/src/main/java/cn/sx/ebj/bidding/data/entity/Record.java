package cn.sx.ebj.bidding.data.entity;

import cn.sx.ebj.bidding.core.base.IEntity;

/**
 * 日志表
 */
public class Record extends IEntity {

    private static final long serialVersionUID = -8473667562505476092L;
    //模块
    private String module;
    //功能
    private String func;
    //描述
    private String desc;
    //IP
    private String ip;
    //用户主键
    private String operPk;
    //用户名称
    private String operBy;
    //操作类型 新增、删除、修改、审核、审批
    private int operType;
    //异常信息
    private String ex;

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    public String getFunc() {
        return func;
    }

    public void setFunc(String func) {
        this.func = func;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getOperPk() {
        return operPk;
    }

    public void setOperPk(String operPk) {
        this.operPk = operPk;
    }

    public String getOperBy() {
        return operBy;
    }

    public void setOperBy(String operBy) {
        this.operBy = operBy;
    }

    public int getOperType() {
        return operType;
    }

    public void setOperType(int operType) {
        this.operType = operType;
    }

    public String getEx() {
        return ex;
    }

    public void setEx(String ex) {
        this.ex = ex;
    }
}
