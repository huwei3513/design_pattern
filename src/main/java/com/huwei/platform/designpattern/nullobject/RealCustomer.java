package com.huwei.platform.designpattern.nullobject;

/**
 * Description:
 *
 * @author: huwei
 * @date: 2019-10-13
 */
public class RealCustomer extends AbstractCustomer {

    public RealCustomer(String name) {
        this.name = name;
    }

    @Override
    public boolean isNull() {
        return false;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
