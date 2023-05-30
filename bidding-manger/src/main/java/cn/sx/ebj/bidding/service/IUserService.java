package cn.sx.ebj.bidding.service;

import cn.sx.ebj.bidding.model.UserModel;

/**
 * 用户service接口
 *
 * @name: IUserService
 * @author: chunjie
 * @date: 2022-11-12 18:05
 **/

public interface IUserService {

    UserModel getUserByName(String name);
}
