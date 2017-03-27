package com.leiyu.designpattern.abstractfactory.impl;

import com.leiyu.designpattern.abstractfactory.Tshirt;

import java.util.Date;

/**
 * Created by wh on 2017/3/2.
 */
public class CasualTshirt implements Tshirt {
    public void show() {
        System.out.println("this is casualTshirt ! ");
    }

}
