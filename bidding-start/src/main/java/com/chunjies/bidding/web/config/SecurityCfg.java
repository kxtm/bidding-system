package com.chunjies.bidding.web.config;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @name: 拦截器
 * @author: chunjie
 * @date: 2022-11-19 01:12
 **/
public class SecurityCfg implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        return true;
    }
}
