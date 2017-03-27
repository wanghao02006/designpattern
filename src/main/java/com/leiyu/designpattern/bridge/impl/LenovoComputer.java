package com.leiyu.designpattern.bridge.impl;

import com.leiyu.designpattern.bridge.CPU;
import com.leiyu.designpattern.bridge.Computer;
import com.leiyu.designpattern.bridge.Memory;

/**
 * Created by wh on 2017/3/14.
 */
public class LenovoComputer implements Computer {

    private CPU cpu;

    private Memory memory;

    public LenovoComputer(CPU cpu, Memory memory) {
        this.cpu = cpu;
        this.memory = memory;
    }

    public void compute() {
        System.out.println("I am LenovoComputer.");
        this.cpu.compute();
        this.memory.store();
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }
}
