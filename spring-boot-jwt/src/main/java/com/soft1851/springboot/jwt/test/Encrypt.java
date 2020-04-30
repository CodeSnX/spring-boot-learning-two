package com.soft1851.springboot.jwt.test;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;

import java.util.Date;

public class Encrypt {
    /**
     * 生成加密后的token
     * @param isVip
     * @param school
     * @param clazz
     * @param username
     * @return 加密后的token
     */
    public String getToken(final boolean isVip, final String school,
                           final String clazz, final String username) {
        String token = null;
        try {
//            Date expiresAt = new Date(System.currentTimeMillis() + 24L * 60L * 3600L * 1000L);
            Date expiresAt = new Date(System.currentTimeMillis() + 1L*10L * 1000L);
            token = JWT.create()
                    .withIssuer("auth0")
                    .withClaim("isVip", isVip)
                    .withClaim("school", school)
                    .withClaim("clazz", clazz)
                    .withClaim("username",username)
                    .withExpiresAt(expiresAt)
                    // 使用了HMAC256加密算法, mySecret是用来加密数字签名的密钥。
                    .sign(Algorithm.HMAC256(Sha256Util.getSHA256("mySecret")));

        } catch (Exception exception) {
            //Invalid Signing configuration / Couldn't convert Claims.
        }
        return token;
    }
}
