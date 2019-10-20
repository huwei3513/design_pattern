package com.huwei.platform.designpattern.decorator;

/**
 * Description:
 *
 * @author: huwei
 * @date: 2019-10-06
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("draw circle");
    }
}
