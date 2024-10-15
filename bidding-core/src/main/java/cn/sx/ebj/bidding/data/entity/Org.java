package cn.sx.ebj.bidding.data.entity;

import cn.sx.ebj.bidding.core.base.IEntity;

public class Org extends IEntity {
    private String orgId;

    private String orgCode;

    private String orgName;

    private String orgShortName;

    private String orgParentId;

    private Integer orgType;

    private Integer orgLevel;

    private Integer orgSort;

    private Integer orgStatus;

    private String remark;

    private String orgCorpId;

    private String orgCorpName;

    private String orgBranchId;

    private String orgBranchName;

    private String orgCityId;

    private String orgCityName;

    private String orgCountyId;

    private String orgCountyName;

    private String orgSeq;

    private String orgSeqCh;


    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId == null ? null : orgId.trim();
    }

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode == null ? null : orgCode.trim();
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName == null ? null : orgName.trim();
    }

    public String getOrgShortName() {
        return orgShortName;
    }

    public void setOrgShortName(String orgShortName) {
        this.orgShortName = orgShortName == null ? null : orgShortName.trim();
    }

    public String getOrgParentId() {
        return orgParentId;
    }

    public void setOrgParentId(String orgParentId) {
        this.orgParentId = orgParentId == null ? null : orgParentId.trim();
    }

    public Integer getOrgType() {
        return orgType;
    }

    public void setOrgType(Integer orgType) {
        this.orgType = orgType;
    }

    public Integer getOrgLevel() {
        return orgLevel;
    }

    public void setOrgLevel(Integer orgLevel) {
        this.orgLevel = orgLevel;
    }

    public Integer getOrgSort() {
        return orgSort;
    }

    public void setOrgSort(Integer orgSort) {
        this.orgSort = orgSort;
    }

    public Integer getOrgStatus() {
        return orgStatus;
    }

    public void setOrgStatus(Integer orgStatus) {
        this.orgStatus = orgStatus;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getOrgCorpId() {
        return orgCorpId;
    }

    public void setOrgCorpId(String orgCorpId) {
        this.orgCorpId = orgCorpId == null ? null : orgCorpId.trim();
    }

    public String getOrgCorpName() {
        return orgCorpName;
    }

    public void setOrgCorpName(String orgCorpName) {
        this.orgCorpName = orgCorpName == null ? null : orgCorpName.trim();
    }

    public String getOrgBranchId() {
        return orgBranchId;
    }

    public void setOrgBranchId(String orgBranchId) {
        this.orgBranchId = orgBranchId == null ? null : orgBranchId.trim();
    }

    public String getOrgBranchName() {
        return orgBranchName;
    }

    public void setOrgBranchName(String orgBranchName) {
        this.orgBranchName = orgBranchName == null ? null : orgBranchName.trim();
    }

    public String getOrgCityId() {
        return orgCityId;
    }

    public void setOrgCityId(String orgCityId) {
        this.orgCityId = orgCityId == null ? null : orgCityId.trim();
    }

    public String getOrgCityName() {
        return orgCityName;
    }

    public void setOrgCityName(String orgCityName) {
        this.orgCityName = orgCityName == null ? null : orgCityName.trim();
    }

    public String getOrgCountyId() {
        return orgCountyId;
    }

    public void setOrgCountyId(String orgCountyId) {
        this.orgCountyId = orgCountyId == null ? null : orgCountyId.trim();
    }

    public String getOrgCountyName() {
        return orgCountyName;
    }

    public void setOrgCountyName(String orgCountyName) {
        this.orgCountyName = orgCountyName == null ? null : orgCountyName.trim();
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