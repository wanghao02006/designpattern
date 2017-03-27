package com.leiyu.designpattern.builderpattern;

/**
 * Created by wh on 2017/3/8.
 */
public interface Builder {

    void installEngine(AbstractCar car);

    void installDoor(AbstractCar car);

    void installTyre(AbstractCar car);

    AbstractCar productCar();
}
