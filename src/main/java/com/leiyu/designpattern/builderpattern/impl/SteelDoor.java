package com.leiyu.designpattern.builderpattern.impl;

import com.leiyu.designpattern.builderpattern.Door;

/**
 * Created by wh on 2017/3/8.
 */
public class SteelDoor implements Door {
    public String show() {
        return "steel";
    }

    @Override
    public String toString() {
        return show();
    }
}
