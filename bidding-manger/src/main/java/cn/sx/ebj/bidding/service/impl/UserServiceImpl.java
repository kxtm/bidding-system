package cn.sx.ebj.bidding.service.impl;

import cn.sx.ebj.bidding.data.dao.UserMapper;
import cn.sx.ebj.bidding.data.entity.User;
import cn.sx.ebj.bidding.service.IUserService;
import cn.sx.ebj.bidding.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 用户service 接口实现类
 *
 * @name: UserServiceImpl
 * @author: chunjie
 * @date: 2022-11-12 18:06
 **/
@Service("userService")
public class UserServiceImpl implements IUserService {

    private UserMapper userMapper;

    @Override
    public UserModel getUserByName(String name) {
        User user=userMapper.selectUser("1");

        return new UserModel();
    }

    @Autowired
    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }
}
