package com.soft1851.springboot.jwt.test;

import com.auth0.jwt.interfaces.DecodedJWT;

public class Test {
    public static void main(String[] args) {
        // 生成token
        Encrypt encrypt = new Encrypt();
        String token = encrypt.getToken(false, "Niit", "soft1851","xgp");

        // 打印token
        System.out.println("token: " + token);

        // 解密token
        Decrypt decrypt = new Decrypt();
        DecodedJWT jwt = decrypt.deToken(token);

        System.out.println("issuer: " + jwt.getIssuer());
        System.out.println("isVip:  " + jwt.getClaim("isVip").asBoolean());
        System.out.println("school: " + jwt.getClaim("school").asString());
        System.out.println("clazz:  " + jwt.getClaim("clazz").asString());
        System.out.println("username：" + jwt.getClaim("username").asString());
        System.out.println("过期时间：" + jwt.getExpiresAt());
        long time1 = System.currentTimeMillis();
        long time2 = jwt.getExpiresAt().getTime();
        while (time1<=time2){
            time1 = System.currentTimeMillis();
        }
        System.out.println("token已过期");

    }
}
