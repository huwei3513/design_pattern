package com.huwei.platform.designpattern.abstractfactory;

/**
 * Description:
 *
 * @author: huwei
 * @date: 2019-05-02
 */
public abstract class AbstractFactory {

    /**
     * 生产颜色
     *
     * @param color
     * @return
     */
    public abstract Color getColor(String color);

    /**
     * 生产形状
     *
     * @param type
     * @return
     */
    public abstract Shape getShape(String type);
}
