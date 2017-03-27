package com.leiyu.designpattern.compositepattern;

/**
 * Created by wh on 2017/3/24.
 */
public abstract class Dept {

    private String name ;

    public Dept(String name) {
        this.name = name;
    }

    protected abstract void add(Dept company);

    protected abstract void romove(Dept company);

    protected abstract void display(int depth);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
