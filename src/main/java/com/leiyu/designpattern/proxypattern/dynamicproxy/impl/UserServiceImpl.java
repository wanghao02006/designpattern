package com.leiyu.designpattern.proxypattern.dynamicproxy.impl;

import com.leiyu.designpattern.proxypattern.dynamicproxy.UserService;

/**
 * Created by wh on 2017/6/1.
 */
public class UserServiceImpl implements UserService {
    @Override
    public String getName(int id) {
        System.out.println("-----------getName------------");
        return "Tom";
    }

    @Override
    public Integer getAge(int id) {
        System.out.println("------------getAge------------");
        return 10;
    }
}
