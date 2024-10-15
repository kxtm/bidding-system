package cn.sx.ebj.bidding.web.service;

import cn.sx.ebj.bidding.web.model.LoginDto;

/**
 * 用户service接口
 *
 * @name: IUserService
 * @author: chunjie
 * @date: 2022-11-12 18:05
 **/

public interface IUserFace {

    LoginDto getUserByName(String name);
}
