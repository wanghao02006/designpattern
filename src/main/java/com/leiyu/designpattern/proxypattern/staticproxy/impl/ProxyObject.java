package com.leiyu.designpattern.proxypattern.staticproxy.impl;

import com.leiyu.designpattern.proxypattern.staticproxy.AbstractObject;

/**
 * Created by wh on 2017/6/1.
 */
public class ProxyObject implements AbstractObject {

    AbstractObject realObject = null;

    @Override
    public void operation() {
        before();
        if (null == realObject){
            realObject = new RealObject();
        }
        realObject.operation();
        after();
    }

    private void before(){
        System.out.println("ProxyObject before!");
    }

    private void after(){
        System.out.println("ProxyObject after!");
    }
}
