package com.leiyu.designpattern.factorypattern.factory.impl;

import com.leiyu.designpattern.factorypattern.entity.Shape;
import com.leiyu.designpattern.factorypattern.entity.impl.Square;
import com.leiyu.designpattern.factorypattern.factory.AbstractFactory;

/**
 * Created by wh on 2017/2/24.
 */
public class SquareShapeFactory implements AbstractFactory {
    public Shape getShape() {
        return new Square();
    }
}
