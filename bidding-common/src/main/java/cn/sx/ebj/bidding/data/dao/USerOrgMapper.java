package cn.sx.ebj.bidding.data.dao;

import cn.sx.ebj.bidding.data.entity.USerOrg;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface USerOrgMapper {
    int deleteByPrimaryKey(Long id);

    int insert(USerOrg record);

    int insertSelective(USerOrg record);

    USerOrg selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(USerOrg record);

    int updateByPrimaryKey(USerOrg record);
}