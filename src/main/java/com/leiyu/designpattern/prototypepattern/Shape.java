package com.leiyu.designpattern.prototypepattern;

/**
 * Created by wh on 2017/3/10.
 */
public abstract class Shape implements Cloneable {
    public abstract void draw();
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
