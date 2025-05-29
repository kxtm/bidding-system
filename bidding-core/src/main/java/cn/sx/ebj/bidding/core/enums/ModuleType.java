package cn.sx.ebj.bidding.core.enums;

public enum ModuleType {
    CGGL("CGGL","采购管理"),CGSC("CGSC","采购商城"),CGMH("CGMH","采购门户"),EMPTY("","");
    private String type;
    private String desc;

    ModuleType(String type, String desc) {
        this.type = type;
        this.desc = desc;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
