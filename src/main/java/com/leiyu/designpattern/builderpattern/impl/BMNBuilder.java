package com.leiyu.designpattern.builderpattern.impl;

import com.leiyu.designpattern.builderpattern.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wh on 2017/3/8.
 */
public class BMNBuilder implements Builder{

    public void installEngine(AbstractCar car) {
        Engine engine = new HondaEngine();
        car.setEngine(engine);
    }

    public void installDoor(AbstractCar car) {
        List<Door> doors = new ArrayList<Door>();
        for(int i = 0 ; i < 4 ; i++){
            doors.add(new AlloyDoor());
        }
        car.setDoors(doors);
    }

    public void installTyre(AbstractCar car) {
        List<Tyre> tires = new ArrayList<Tyre>();
        for(int i = 0 ; i < 4 ; i++){
            tires.add(new MichelinTyre());
        }
        car.setTires(tires);
    }

    public AbstractCar productCar() {
        AbstractCar car = new BMNCar();
        installDoor(car);
        installEngine(car);
        installTyre(car);
        return car;
    }
}
