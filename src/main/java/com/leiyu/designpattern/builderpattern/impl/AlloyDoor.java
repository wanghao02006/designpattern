package com.leiyu.designpattern.builderpattern.impl;

import com.leiyu.designpattern.builderpattern.Door;

/**
 * Created by wh on 2017/3/8.
 */
public class AlloyDoor implements Door {
    public String show() {
        return "alloy";
    }

    @Override
    public String toString() {
        return this.show();
    }
}
