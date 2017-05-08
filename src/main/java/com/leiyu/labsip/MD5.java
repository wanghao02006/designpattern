/*
 * Copyright (c) 2017 PatSnap Pte Ltd, All Rights Reserved.
 */

package com.leiyu.labsip;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @author zhaoxinsheng
 * @date 02/05/2017.
 */
public class MD5 {

    private static char hexDigits[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static String encrypt(String plain) {
        byte[] btInput = plain.getBytes();
        MessageDigest mdInst;
        try {
            // 获得MD5摘要算法的 MessageDigest 对象
            mdInst = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalArgumentException(e);
        }
        // 获得密文
        byte[] md = mdInst.digest(btInput);
        // 把密文转换成十六进制的字符串形式
        char str[] = new char[md.length * 2];
        int i = 0;
        for (byte byte0 : md) {
            str[i++] = hexDigits[byte0 >>> 4 & 0xf];
            str[i++] = hexDigits[byte0 & 0xf];
        }
        return new String(str);
    }

}
