package com.huwei.platform.designpattern.nullobject;

/**
 * Description:
 *
 * @author: huwei
 * @date: 2019-10-13
 */
public abstract class AbstractCustomer {

    protected String name;

    /**
     * 是否为空
     *
     * @return
     */
    public abstract boolean isNull();

    /**
     * 获得名字
     *
     * @return
     */
    public abstract String getName();
}
