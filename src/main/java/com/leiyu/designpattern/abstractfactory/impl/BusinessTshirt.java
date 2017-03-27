package com.leiyu.designpattern.abstractfactory.impl;

import com.leiyu.designpattern.abstractfactory.Tshirt;

/**
 * Created by wh on 2017/3/2.
 */
public class BusinessTshirt implements Tshirt {
    public void show() {
        System.out.println("this is businessTshirt ! ");
    }
}
