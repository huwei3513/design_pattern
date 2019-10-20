package com.huwei.platform.designpattern.builder;

/**
 * Description:
 *
 * @author: huwei
 * @date: 2019-05-03
 */
public interface Item {
    /**
     * 名字
     *
     * @return
     */
    String name();

    /**
     * 包装
     *
     * @return
     */
    Packing packing();

    /**
     * 价格
     *
     * @return
     */
    float price();
}
