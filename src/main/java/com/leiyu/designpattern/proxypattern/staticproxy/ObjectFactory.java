package com.leiyu.designpattern.proxypattern.staticproxy;

import com.leiyu.designpattern.proxypattern.staticproxy.impl.ProxyObject;

/**
 * Created by wh on 2017/6/1.
 */
public class ObjectFactory {

    public static AbstractObject getObject(){
        return new ProxyObject();
    }
}
