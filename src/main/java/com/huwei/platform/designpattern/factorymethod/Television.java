package com.huwei.platform.designpattern.factorymethod;

/**
 * @author huwei
 * @date 2021/4/5 16:20
 */
public class Television implements Product {

    @Override
    public void run() {
        System.out.println("-->电视正在运行……");
    }
}
