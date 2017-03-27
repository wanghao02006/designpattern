package com.leiyu.designpattern.abstractfactory.impl;

import com.leiyu.designpattern.abstractfactory.Coat;

/**
 * Created by wh on 2017/3/2.
 */
public class BusinessCoat implements Coat {
    public void show() {
        System.out.println("this is bussiness Coat!");
    }
}
