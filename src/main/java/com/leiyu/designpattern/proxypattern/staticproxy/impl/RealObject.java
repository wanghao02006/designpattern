package com.leiyu.designpattern.proxypattern.staticproxy.impl;

import com.leiyu.designpattern.proxypattern.staticproxy.AbstractObject;

/**
 * Created by wh on 2017/6/1.
 */
public class RealObject implements AbstractObject {

    public RealObject(){
        System.out.println("初始化我需要很长时间，并且初始化完成后会占用大量内存");
    }

    @Override
    public void operation() {
        System.out.println("RealObject operation!");
    }
}
