package com.leiyu.designpattern.bridge.impl;

import com.leiyu.designpattern.bridge.CPU;

/**
 * Created by wh on 2017/3/14.
 */
public class AMDCPU implements CPU {
    public void compute() {
        System.out.println("i can play game!");
    }
}
