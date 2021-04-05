package com.huwei.platform.designpattern.factorymethod;

/**
 * @author huwei
 * @date 2021/4/5 16:26
 */
public class Client {

    public static void main(String[] args) {
        Factory tvFactory = new TelevisionFactory();
        Product tv = tvFactory.produce();
        tv.run();
        Factory washingMachineFactory = new WashingMachineFactory();
        Product washingMachine = washingMachineFactory.produce();
        washingMachine.run();
    }
}
