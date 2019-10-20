package com.huwei.platform.designpattern.builder;

/**
 * Description:
 *
 * @author: huwei
 * @date: 2019-05-03
 */
public class Pepsi extends AbstractColdDrink {
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 35.0f;
    }
}
