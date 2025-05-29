package cn.sx.ebj.bidding.data.dao;

import cn.sx.ebj.bidding.data.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    int deleteByEmpId(String empId);

    int insert(User record);

    User selectByEmpId(String empId);

    int updateByEmpId(User record);

}