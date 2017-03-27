package com.leiyu.designpattern.singleton;

/**
 * Created by wh on 2017/3/6.
 */
public class StaticClassSingleton {

    private StaticClassSingleton(){

    }

    private static class SingletonFacton{
        public static StaticClassSingleton INSTANCE =  new StaticClassSingleton();
    }

    public StaticClassSingleton getInstance () {
        return SingletonFacton.INSTANCE;
    }
}
