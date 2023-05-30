package cn.sx.ebj.bidding.core.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;

/**
 * @name: 字符工具类
 * @author: chunjie
 * @date: 2022-11-19 13:08
 **/

public class StringUtil extends StringUtils {

    private static Logger log = LoggerFactory.getLogger(StringUtil.class);


    /**
     * 判断字符串是否为为NULL or 空字符串
     *
     * @param obj String
     * @return boolean
     */
    public static boolean isEmpty(String obj) {
        log.info("isEmpty 参数->{}",obj);
        return (obj == null || obj.equals(""));
    }

    /**
     * 字符串对象不为NULL or 空字符串
     *
     * @param obj String
     * @return boolean
     */
    public static boolean isNotEmpty(String obj) {
        log.info("isNotEmpty 参数->{}",obj);
        return (obj != null && !obj.equals(""));
    }


}
