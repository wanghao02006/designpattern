package com.leiyu.designpattern.proxypattern.dynamicproxy.cglib;

import com.leiyu.designpattern.proxypattern.dynamicproxy.UserService;
import com.leiyu.designpattern.proxypattern.dynamicproxy.impl.UserServiceImpl;
import net.sf.cglib.proxy.Enhancer;

/**
 * Created by wh on 2017/6/1.
 */
public class Main2 {

    public static void main(String[] args) {
        CglibProxy cglibProxy = new CglibProxy();

        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(UserServiceImpl.class);
        enhancer.setCallback(cglibProxy);

        UserService o = (UserService)enhancer.create();
        o.getName(1);
        o.getAge(1);
    }

}
