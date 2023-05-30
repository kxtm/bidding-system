package cn.sx.ebj.bidding.data.dao;

import cn.sx.ebj.bidding.data.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
    @Select("select * from t_user where name=#{name}")
    User selectUser(String name);
}
