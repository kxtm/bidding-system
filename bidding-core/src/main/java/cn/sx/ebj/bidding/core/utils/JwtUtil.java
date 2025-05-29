package cn.sx.ebj.bidding.core.utils;

import java.util.Map;

/**
 * {@code @author} chunjie
 * {@code @time} 2023/10/10
 * {@code @description}
 */
public class JwtUtil {

    private final String SIGN = "lsjdfshfi#%%#*nfhd";//将sign设置成全局变量

    public String auth(Map<String, String> map) {
//        Calendar calendar = Calendar.getInstance();
//        calendar.add(Calendar.DATE,7);//定义过期时间
//        Date date = calendar.getTime();
//        JWTCreator.Builder builder = JWT.create();
//        //使用map的forEach()方法（lambda表达式），动态设置payload
//        map.forEach(builder::withClaim);
//         //为token设置过期时间
//        return builder.withExpiresAt(date).sign(Algorithm.HMAC512(SIGN));
        return null;
    }

//    public DecodedJWT verifyToken(String token){
//        return JWT.require(Algorithm.HMAC512(SIGN)).build().verify(token);
//    }
}
