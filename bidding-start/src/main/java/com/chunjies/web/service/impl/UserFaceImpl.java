package com.chunjies.web.service.impl;

import com.chunjies.bidding.common.annotation.SysLog;
import com.chunjies.bidding.common.enums.Modules;
import com.chunjies.bidding.common.enums.OperType;
import com.chunjies.bidding.data.dao.UserMapper;
import com.chunjies.web.model.UserModel;
import com.chunjies.web.service.IUserFace;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 用户service 接口实现类
 *
 * @name: UserServiceImpl
 * @author: chunjie
 * @date: 2022-11-12 18:06
 **/
@Service("userFace")
public class UserFaceImpl implements IUserFace {

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
