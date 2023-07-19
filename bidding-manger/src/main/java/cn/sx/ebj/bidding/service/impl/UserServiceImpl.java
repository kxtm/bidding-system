package cn.sx.ebj.bidding.service.impl;

import cn.sx.ebj.bidding.core.annotation.SysLog;
import cn.sx.ebj.bidding.core.enums.Modules;
import cn.sx.ebj.bidding.core.enums.OperType;
import cn.sx.ebj.bidding.data.dao.UserMapper;
import cn.sx.ebj.bidding.data.entity.User;
import cn.sx.ebj.bidding.model.UserModel;
import cn.sx.ebj.bidding.service.IUserService;
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

    private UserMapper userDao;

    @Override
    @SysLog(module = Modules.CGGL,desc = "用户名查询用户",type = OperType.QUERY)
    public UserModel getUserByName(String name) {


        return new UserModel();
    }

    @Autowired
    public void setUserMapper(UserMapper userDao) {
        this.userDao = userDao;
    }
}
