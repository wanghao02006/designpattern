package com.leiyu.designpattern.chainresponsibilitypattern;

import com.leiyu.designpattern.chainresponsibilitypattern.impl.ConcreteHandler1;
import com.leiyu.designpattern.chainresponsibilitypattern.impl.ConcreteHandler2;
import com.leiyu.designpattern.chainresponsibilitypattern.pojo.RequestBody;

/**
 * Created by wh on 2017/5/31.
 */
public class Client {

    public static void main(String[] args) {
        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2(handler1);
        Handler chain = new ConcreteHandler1(handler2);
        RequestBody body = new RequestBody();
        chain.handleRequest(body);
        System.out.println(body.getResponse());
    }

}
