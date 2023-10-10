package com.chunjies.bidding.data.dao;

import com.chunjies.bidding.data.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    int deleteByEmpId(String empId);

    int insert(User record);

    User selectByEmpId(String empId);

    int updateByEmpId(User record);

}