package com.huwei.platform.designpattern.iterator;

/**
 * Description:
 *
 * @author: huwei
 * @date: 2019-10-08
 */
public interface Iterator {

    /**
     * 是否还有下一个
     *
     * @return
     */
    boolean hasNext();

    /**
     * 获得下一个
     *
     * @return
     */
    Object next();
}
