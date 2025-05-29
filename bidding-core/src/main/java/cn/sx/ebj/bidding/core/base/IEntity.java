package cn.sx.ebj.bidding.core.base;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

/**
 * 实体基类
 */
public class IEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    //序号主键
    private Long id;
    //创建人业务主键
    private String createPk;
    //创建人业务名称
    private String createBy;
    //修改人业务名称
    private String modifyBy;
    //修改人业务主键
    private String modifyPk;
    //创建时间
    private Date createTime;
    //修改时间
    private Date modifyTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCreatePk() {
        return createPk;
    }

    public void setCreatePk(String createPk) {
        this.createPk = createPk;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public String getModifyBy() {
        return modifyBy;
    }

    public void setModifyBy(String modifyBy) {
        this.modifyBy = modifyBy;
    }

    public String getModifyPk() {
        return modifyPk;
    }

    public void setModifyPk(String modifyPk) {
        this.modifyPk = modifyPk;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }
}
