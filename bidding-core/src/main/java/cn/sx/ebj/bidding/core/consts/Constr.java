package cn.sx.ebj.bidding.core.consts;

public class Constr {
    //项目包
    public final static String BASE_PACKAGE = "cn.sx.ebj.bidding";
    //mybatis MAPPER
    public final static String MAPPER_PACKAGE = "cn.sx.ebj.bidding.data.dao";

    //用户名 数字 字母 汉字
    public final static String REGEXP_LOGIN_NAME = "[A-Za-z0-9_\\-\\u4e00-\\u9fa5]+";
    //身份证号
    public final static String REGEXP_ID_CARD = "\\d{17}[\\d|x]|\\d{15}";
    //手机号
    public final static String REGEXP_MOBILE_NO = "0?(13|14|15|18|17)[0-9]{9}";


}
