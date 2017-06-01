package com.leiyu.designpattern.chainresponsibilitypattern;

import com.leiyu.designpattern.chainresponsibilitypattern.pojo.RequestBody;

/**
 * Created by wh on 2017/5/31.
 */
public interface Handler {

    public void handleRequest(RequestBody body);
}
