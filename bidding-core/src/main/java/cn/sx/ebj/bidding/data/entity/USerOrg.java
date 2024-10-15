package cn.sx.ebj.bidding.data.entity;

import cn.sx.ebj.bidding.core.base.IEntity;

public class USerOrg extends IEntity {

    private String empId;

    private String orgId;

    private String orgName;

    private Integer useType;

    private Integer useState;

    private String orgSeq;

    private String orgSeqCh;



    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId == null ? null : empId.trim();
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId == null ? null : orgId.trim();
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName == null ? null : orgName.trim();
    }

    public Integer getUseType() {
        return useType;
    }

    public void setUseType(Integer useType) {
        this.useType = useType;
    }

    public Integer getUseState() {
        return useState;
    }

    public void setUseState(Integer useState) {
        this.useState = useState;
    }

    public String getOrgSeq() {
        return orgSeq;
    }

    public void setOrgSeq(String orgSeq) {
        this.orgSeq = orgSeq == null ? null : orgSeq.trim();
    }

    public String getOrgSeqCh() {
        return orgSeqCh;
    }

    public void setOrgSeqCh(String orgSeqCh) {
        this.orgSeqCh = orgSeqCh == null ? null : orgSeqCh.trim();
    }

}