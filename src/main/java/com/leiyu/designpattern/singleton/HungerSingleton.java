package com.leiyu.designpattern.singleton;

/**
 * Created by wh on 2017/3/6.
 */
public class HungerSingleton {

    private static HungerSingleton instance = new HungerSingleton();

    private HungerSingleton(){

    }

    public static HungerSingleton getInstance(){
        return instance;
    }

}
