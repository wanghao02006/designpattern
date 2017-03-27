package com.leiyu.designpattern.builderpattern;

import java.util.List;

/**
 * Created by wh on 2017/3/8.
 */
public abstract class AbstractCar implements Car{

    private List<Door> doors = null;

    private List<Tyre> tires = null;

    private Engine engine = null;



    public List<Door> getDoors() {
        return doors;
    }

    public void setDoors(List<Door> doors) {
        this.doors = doors;
    }

    public List<Tyre> getTires() {
        return tires;
    }

    public void setTires(List<Tyre> tires) {
        this.tires = tires;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
