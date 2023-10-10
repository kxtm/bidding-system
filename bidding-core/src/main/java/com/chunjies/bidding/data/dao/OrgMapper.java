package com.chunjies.bidding.data.dao;

import com.chunjies.bidding.data.entity.Org;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrgMapper {

    int deleteByOrgId(String orgId);

    int insert(Org record);

    Org selectByOrgId(String orgId);

    int updateByOrgId(Org record);
}