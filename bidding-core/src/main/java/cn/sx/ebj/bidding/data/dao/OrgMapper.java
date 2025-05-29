package cn.sx.ebj.bidding.data.dao;

import cn.sx.ebj.bidding.data.entity.Org;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrgMapper {

    int deleteByOrgId(String orgId);

    int insert(Org record);

    Org selectByOrgId(String orgId);

    int updateByOrgId(Org record);
}