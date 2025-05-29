package cn.sx.ebj.bidding.core.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.ObjectUtils;

/**
 * 类型转换工具
 * <p>
 * {@code @name:} jav
 * {@code @author:} chunjie
 * {@code @date:} 2022-11-12 21:18
 **/

public class Converts {
    protected static Logger log = LoggerFactory.getLogger(Converts.class);

    /**
     * 转成为对象
     */
    public static String toStr(Object obj) {
        log.info("toStr->{}", obj);
        return String.valueOf(obj);
    }

    public static Integer toInt(Object obj) {
        return Integer.valueOf(ObjectUtils.isEmpty(obj) ? "0" : String.valueOf(obj));
    }

    public static Long toLong(Object obj) {
        return Long.valueOf(ObjectUtils.isEmpty(obj) ? "0" : String.valueOf(obj));
    }

    public static Double toDouble(Object obj) {
        return Double.valueOf(ObjectUtils.isEmpty(obj) ? "0" : String.valueOf(obj));
    }


}
