package com.leiyu.designpattern.singleton;

/**
 * Created by wh on 2017/3/6.
 */
public class LazySingleton {

    private static LazySingleton instance = null;

    private LazySingleton(){

    }

    public static LazySingleton getInstance(){
        if (null == instance){
            instance = new LazySingleton();
        }
        return instance;
    }
}
