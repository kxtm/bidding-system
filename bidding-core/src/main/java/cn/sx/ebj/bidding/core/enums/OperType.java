package cn.sx.ebj.bidding.core.enums;

public enum OperType {
    QUERY("0", "查询"), ADD("1", "新增"), MODIFY("2", "修改"), DEL("3", "删除"),EMPTY("","");
    private String type;
    private String desc;

    OperType(String type, String desc) {
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
