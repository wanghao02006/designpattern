package com.leiyu.designpattern.factorypattern.factory.impl;

import com.leiyu.designpattern.factorypattern.entity.Shape;
import com.leiyu.designpattern.factorypattern.entity.impl.Circle;
import com.leiyu.designpattern.factorypattern.factory.AbstractFactory;
import com.leiyu.designpattern.factorypattern.factory.ShapeFactory;

/**
 * Created by wh on 2017/2/24.
 */
public class CircleShapeFactory implements AbstractFactory {
    public Shape getShape() {
        return new Circle();
    }
}
