package com.leiyu.designpattern.bridge;

import com.leiyu.designpattern.bridge.impl.IntelCPU;
import com.leiyu.designpattern.bridge.impl.KinstonMemory;
import com.leiyu.designpattern.bridge.impl.LenovoComputer;

/**
 * Created by wh on 2017/3/14.
 */
public class Main {

    public static void main(String[] args) {
        CPU cpu = new IntelCPU();
        Memory memory = new KinstonMemory();
        Computer computer = new LenovoComputer(cpu,memory);
        computer.compute();
    }
}
