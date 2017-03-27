package com.leiyu.designpattern.factorypattern.entity.impl;

import com.leiyu.designpattern.factorypattern.entity.Shape;

/**
 * Created by wh on 2017/2/24.
 */
public class Circle implements Shape {
    public void draw() {
        System.out.println("this is Circle draw");
    }
}
