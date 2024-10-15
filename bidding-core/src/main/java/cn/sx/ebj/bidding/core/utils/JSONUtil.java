package cn.sx.ebj.bidding.core.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class JSONUtil {
    static Logger log = LoggerFactory.getLogger(JSONUtil.class);
    static final ObjectMapper mapper = new ObjectMapper();

    /**
     * 对象转成JSON 字符串
     *
     * @param data Object
     * @return String
     */
    public static String toJson(Object data) {
        try {
            return mapper.writeValueAsString(data);
        } catch (JsonProcessingException e) {
            log.error("toJson", e);
        }
        return null;
    }

    /**
     *  字符串转对象
     * @param json  String
     * @param beanType class
     * @param <T> T
     * @return T
     */
    public static <T> T tobject(String json, Class<T> beanType) {
        try {
            return mapper.readValue(json, beanType);
        } catch (JsonProcessingException e) {
            log.error("object转换异常", e);
        }
        return null;
    }

    /**
     * 字符串转任何对象
     * @param json String
     * @param beanType beanType
     * @return T
     *
     */
    public static <T> T toObject(String json, TypeReference<T> beanType) {
        try {
            return mapper.readValue(json, beanType);
        } catch (JsonProcessingException e) {
            log.error("toObject 转换异常", e);
        }
        return null;
    }


    /**
     * String 转 集合对象
     * @param json
     * @param beanType  Class
     * @return
     * @param <T>
     */
    public static <T> List<T> toList(String json, Class<T> beanType) {
        try {
            return mapper.readValue(json, mapper.getTypeFactory().constructParametricType(List.class, beanType));
        } catch (JsonProcessingException e) {
            log.error("toList 转换异常", e);
        }
        return null;
    }

}
