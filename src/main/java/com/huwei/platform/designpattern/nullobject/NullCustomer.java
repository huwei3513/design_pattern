package com.huwei.platform.designpattern.nullobject;

/**
 * Description:
 *
 * @author: huwei
 * @date: 2019-10-13
 */
public class NullCustomer extends AbstractCustomer {
    @Override
    public boolean isNull() {
        return true;
    }

    @Override
    public String getName() {
        return "Not Available in Customer Database";
    }
}
