package com.leiyu.designpattern.proxypattern.dynamicproxy.cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by wh on 2017/6/1.
 */
public class CglibProxy implements MethodInterceptor {
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("++++++before " + methodProxy.getSuperName() + "++++++");
        System.out.println(method.getName());
        Object o1 = methodProxy.invokeSuper(o, objects);
        System.out.println("++++++after " + methodProxy.getSuperName() + "++++++");
        return o1;
    }
}
