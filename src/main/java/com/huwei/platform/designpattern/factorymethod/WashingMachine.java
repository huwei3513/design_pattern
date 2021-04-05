package com.huwei.platform.designpattern.factorymethod;

/**
 * @author huwei
 * @date 2021/4/5 16:21
 */
public class WashingMachine implements Product {
    @Override
    public void run() {
        System.out.println("-->洗衣机正在运行……");
    }
}
