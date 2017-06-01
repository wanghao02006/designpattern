package com.leiyu.designpattern.proxypattern.staticproxy;

/**
 * Created by wh on 2017/6/1.
 */
public class Client {
    public static void main(String[] args) {
        AbstractObject obj = ObjectFactory.getObject();
        System.out.println("has got object!");
        obj.operation();
    }
}
