package com.chunjies.bidding.web.service.impl;

import com.chunjies.bidding.common.annotation.SysLog;
import com.chunjies.bidding.common.enums.BizMsgType;
import com.chunjies.bidding.common.enums.ModuleType;
import com.chunjies.bidding.common.enums.OperType;
import com.chunjies.bidding.common.exception.BizException;
import com.chunjies.bidding.data.dao.UserMapper;
import com.chunjies.bidding.web.model.LoginDto;
import com.chunjies.bidding.web.service.IUserFace;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 用户service 接口实现类
 *
 * {@code @name:} UserServiceImpl
 * {@code @author:} chunjie
 * {@code @date:} 2022-11-12 18:06
 **/
@Service("userFace")
public class UserFaceImpl implements IUserFace {

    private UserMapper userDao;

    @Override
    @SysLog(module = ModuleType.CGGL,func ="getUserByName" ,desc = "用户名查询用户", type = OperType.QUERY)
    public LoginDto getUserByName(String name) {
        LoginDto dto=new LoginDto();
        dto.setLoginName("aaa");
       return  dto;
    }

    @Autowired
    public void setUserMapper(UserMapper userDao) {
        this.userDao = userDao;
    }
}
