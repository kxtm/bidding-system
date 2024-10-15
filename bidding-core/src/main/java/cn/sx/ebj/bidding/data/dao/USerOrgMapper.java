package cn.sx.ebj.bidding.data.dao;

import cn.sx.ebj.bidding.data.entity.USerOrg;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface USerOrgMapper {

    int deleteByEmpId(String empId);

    int insert(USerOrg record);

    USerOrg selectByEmpId(String empId);

    int updateByEmpId(USerOrg record);

}