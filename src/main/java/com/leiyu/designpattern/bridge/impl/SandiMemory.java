package com.leiyu.designpattern.bridge.impl;

import com.leiyu.designpattern.bridge.Memory;

/**
 * Created by wh on 2017/3/14.
 */
public class SandiMemory implements Memory {
    public void store() {
        System.out.println("storage is fast ! ");
    }
}
