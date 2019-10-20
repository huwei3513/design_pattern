package com.huwei.platform.designpattern.factory;

/**
 * Description:
 *
 * @author: huwei
 * @date: 2019-05-02
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("draw a circle!");
    }
}
