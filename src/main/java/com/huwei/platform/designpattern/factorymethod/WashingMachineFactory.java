package com.huwei.platform.designpattern.factorymethod;

/**
 * @author huwei
 * @date 2021/4/5 16:25
 */
public class WashingMachineFactory implements Factory {
    @Override
    public Product produce() {
        return new WashingMachine();
    }
}
