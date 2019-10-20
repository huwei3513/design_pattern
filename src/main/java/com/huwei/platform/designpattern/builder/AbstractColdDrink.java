package com.huwei.platform.designpattern.builder;

/**
 * Description:
 *
 * @author: huwei
 * @date: 2019-05-03
 */
public abstract class AbstractColdDrink implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }
}
