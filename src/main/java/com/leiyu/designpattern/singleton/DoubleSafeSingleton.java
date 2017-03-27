package com.leiyu.designpattern.singleton;

/**
 * Created by wh on 2017/3/6.
 */
public class DoubleSafeSingleton {

    private static volatile DoubleSafeSingleton instance = null;

    private  DoubleSafeSingleton(){

    }

    public static DoubleSafeSingleton getInstance(){
        if(null == instance){
            synchronized (DoubleSafeSingleton.class){
                if(null == instance){
                    instance = new DoubleSafeSingleton();
                }
            }
        }
        return instance;
    }
}
