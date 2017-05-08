/*
 * Copyright (c) 2017 PatSnap Pte Ltd, All Rights Reserved.
 */

package com.leiyu.labsip;

import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

/**
 * @author zhaoxinsheng
 * @date 02/05/2017.
 */
public class Authcode {


    private static Base64.Encoder encoder = Base64.getEncoder();
    private static Base64.Decoder decoder = Base64.getDecoder();

    private static final int BYTE_LENGTH = 256;
    private static Map<String, String> map = new HashMap<>();

    static {
        map.put("\'", "fanxiegang");
        map.put("/", "zhengxiegang");
        map.put("+", "jiahao");
    }

    public static String authcode(String string, String operation, String key) {
        if (key == null || key.length() == 0) {
            key = "zhongGuoYiDong167";
        }
        if ("DECODE".equals(operation)) {
            for (String c : map.keySet()) {
                string = string.replace(map.get(c), c);
            }
        }
        key = MD5.encrypt(key);
        int keyLength = key.length();
        byte[] bytes = "DECODE".equals(operation) ? decoder.decode(string) : (MD5.encrypt(string + key).substring(0, 8) + string).getBytes();
        int stringLength = bytes.length;
        int[] rndkey = new int[BYTE_LENGTH];
        int[] box = new int[BYTE_LENGTH];
        byte[] result = new byte[stringLength];
        for (int i = 0; i < BYTE_LENGTH; i++) {
            rndkey[i] = key.charAt(i % keyLength);
            box[i] = i;
        }
        for (int i = 0, j = 0; i < BYTE_LENGTH; i++) {
            j = (j + box[i] + rndkey[i]) % BYTE_LENGTH;
            int tmp = box[i];
            box[i] = box[j];
            box[j] = tmp;
        }
        for (int i = 0, j = 0, k = 0; i < stringLength; i++) {
            k = (k + 1) % BYTE_LENGTH;
            j = (j + box[k]) % BYTE_LENGTH;
            int tmp = box[k];
            box[k] = box[j];
            box[j] = tmp;
            result[i] = (byte) (bytes[i] ^ (box[(box[j] + box[k]) % BYTE_LENGTH]));
        }
        if ("DECODE".equals(operation)) {
            String resultStr = new String(result);
            return resultStr.substring(0, 8).equals(MD5.encrypt(resultStr.substring(8) + key).substring(0, 8)) ? resultStr.substring(8) : "";
        } else {
            String resultStr = encoder.encodeToString(result).replace("=", "");
            for (String c : map.keySet()) {
                resultStr = resultStr.replace(c, map.get(c));
            }
            return resultStr;
        }
    }

    public static void main(String[] args) {
        String userInfo = "{\"email\":\"yangxiaoxia@chinamobile.com\",\"role\":\"high\"}";
        String result = authcode(userInfo, "ENCODE", "zhongGuoYiDong167");
        System.out.println(result);
    }
}
