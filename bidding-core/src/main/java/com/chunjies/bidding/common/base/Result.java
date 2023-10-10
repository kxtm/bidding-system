package com.chunjies.bidding.common.base;

import java.io.Serializable;

/**
 * 统一返回数据接口
 *
 * @name: R
 * @author: chunjie
 * @date: 2022-11-12 19:30
 **/

public class Result<T> implements Serializable {
    //成功 true 失败 false
    private boolean code;
    //消息
    private String msg;

    //数据
    private T data;

    public Result(boolean code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }


    /**
     * 成功方法
     *
     * @param msg  返回消息
     * @param data 返回数据
     * @param <T>  对象类型
     * @return R
     */
    public static <T> Result<T> SUCCESS(String msg, T data) {

        return new Result<>(true, msg, data);
    }

    /**
     * 失败返回方法
     *
     * @param msg  消息
     * @param data 数据
     * @param <T>
     * @return R
     */
    public static <T> Result<T> FAIL(String msg, T data) {
        return new Result<>(false, msg, data);
    }


    /**
     * 成功方法
     *
     * @param msg 返回消息
     * @param <T> 对象类型
     * @return R
     */
    public static <T> Result<T> SUCCESS(String msg) {

        return new Result<>(true, msg, null);
    }

    /**
     * 失败返回方法
     *
     * @param msg 消息
     * @param <T>
     * @return R
     */
    public static <T> Result<T> FAIL(String msg) {
        return new Result<>(false, msg, null);
    }

    public boolean isCode() {
        return code;
    }

    public void setCode(boolean code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
