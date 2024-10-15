package cn.sx.ebj.bidding.core.base;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serializable;

/**
 * 统一返回数据接口
 *
 * @name: R
 * @author: chunjie
 * @date: 2022-11-12 19:30
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Result<T> implements Serializable {
    //成功 true 失败 false
    private Boolean code;
    //消息
    private String msg;
    //数据
    private T data;

    private Long timestamp = System.currentTimeMillis();

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
    public static <T> Result<T> ok(String msg, T data) {

        return new Result<>(true, msg, data);
    }

    /**
     * @param data
     * @param <T>
     * @return
     */
    public static <T> Result<T> ok(T data) {

        return new Result<>(true, SUCCESS_DEFAULT_MSG, data);
    }

    /**
     * 失败返回方法
     *
     * @param msg  消息
     * @param data 数据
     * @param <T>
     * @return R
     */
    public static <T> Result<T> error(String msg, T data) {
        return new Result<>(false, msg, data);
    }


    /**
     * 成功方法
     *
     * @param msg 返回消息
     * @param <T> 对象类型
     * @return R
     */
    public static <T> Result<T> ok(String msg) {

        return new Result<>(true, msg, null);
    }

    /**
     * 失败返回方法
     *
     * @param msg 消息
     * @param <T>
     * @return R
     */
    public static <T> Result<T> error(String msg) {
        return new Result<>(false, msg, null);
    }

    public static <T> Result<T> error() {
        return new Result<>(false, ERROR_DEFAULT_MSG, null);
    }

    public Boolean isCode() {
        return code;
    }

    public void setCode(Boolean code) {
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

    public Boolean getCode() {
        return code;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    final static String ERROR_DEFAULT_MSG = "处理错误";
    final static String SUCCESS_DEFAULT_MSG = "处理成功";
}
