package cn.sx.ebj.bidding.data.dao;

import cn.sx.ebj.bidding.data.entity.Org;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrgMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Org record);

    int insertSelective(Org record);

    Org selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Org record);

    int updateByPrimaryKey(Org record);
}