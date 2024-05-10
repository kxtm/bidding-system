package com.chunjies.web.service;

import com.chunjies.web.model.UserModel;

/**
 * 用户service接口
 *
 * @name: IUserService
 * @author: chunjie
 * @date: 2022-11-12 18:05
 **/

public interface IUserFace {

    UserModel getUserByName(String name);
}
