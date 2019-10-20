package com.huwei.platform.designpattern.builder;

/**
 * Description:
 *
 * @author: huwei
 * @date: 2019-05-03
 */
public class Coke extends AbstractColdDrink {
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 30.0f;
    }
}
