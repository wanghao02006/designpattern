package com.leiyu.designpattern.prototypepattern;

import com.leiyu.designpattern.prototypepattern.impl.Circle;
import com.leiyu.designpattern.prototypepattern.impl.Rectangle;
import com.leiyu.designpattern.prototypepattern.impl.Square;

import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by wh on 2017/3/10.
 */
public class ShapeCache {

    private static volatile ShapeCache instance;

    ConcurrentHashMap<String,Shape> cache = new ConcurrentHashMap<String, Shape>();

    private ShapeCache(){
        cache.put("circle",new Circle());
        cache.put("rectangle",new Rectangle());
        cache.put("square",new Square());
    }

    public static ShapeCache getInstance(){
        if(null == instance){
            synchronized (ShapeCache.class){
                if(null == instance){
                    instance = new ShapeCache();
                }
            }
        }
        return instance;
    }

    public Shape getShape(String type) throws CloneNotSupportedException {
        if(!cache.containsKey(type)){
            return null;
        }
        return (Shape) cache.get(type).clone();
    }

}
