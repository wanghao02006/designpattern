package com.leiyu.designpattern.singleton;

/**
 * Created by wh on 2017/3/6.
 */
public class ThreadSafeSingleton {

    private static ThreadSafeSingleton instance = null;

    private ThreadSafeSingleton(){

    }

    public synchronized static ThreadSafeSingleton getInstance(){
        if (null == instance){
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }
}
