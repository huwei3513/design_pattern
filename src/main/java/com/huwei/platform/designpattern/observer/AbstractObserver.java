package com.huwei.platform.designpattern.observer;

/**
 * Description:
 *
 * @author: huwei
 * @date: 2019-10-12
 */
public abstract class AbstractObserver {

    protected Subject subject;

    /**
     * 修改
     */
    public abstract void update();
}
