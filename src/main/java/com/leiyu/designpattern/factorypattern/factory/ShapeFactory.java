package com.leiyu.designpattern.factorypattern.factory;

import com.leiyu.designpattern.factorypattern.entity.Shape;
import com.leiyu.designpattern.factorypattern.entity.impl.Circle;
import com.leiyu.designpattern.factorypattern.entity.impl.Rectangle;
import com.leiyu.designpattern.factorypattern.entity.impl.Square;

/**
 * Created by wh on 2017/2/24.
 */
public class ShapeFactory {

    public Shape getShape(String shapeType){
        if (null == shapeType){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        }else if (shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }else if (shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }
}
