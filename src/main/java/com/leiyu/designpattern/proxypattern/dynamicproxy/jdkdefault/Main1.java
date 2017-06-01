package com.leiyu.designpattern.proxypattern.dynamicproxy.jdkdefault;

import com.leiyu.designpattern.proxypattern.dynamicproxy.UserService;
import com.leiyu.designpattern.proxypattern.dynamicproxy.impl.UserServiceImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by wh on 2017/6/1.
 */
public class Main1 {

    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        InvocationHandler invocationHandler = new MyInvocationHandler(userService);
        UserService userServiceProxy = (UserService) Proxy.newProxyInstance(UserService.class.getClassLoader(),
                userService.getClass().getInterfaces(),invocationHandler);
        System.out.println(userServiceProxy.getName(1));
        System.out.println(userServiceProxy.getAge(1));
    }

}
