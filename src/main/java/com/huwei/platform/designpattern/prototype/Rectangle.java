package com.huwei.platform.designpattern.prototype;

/**
 * Description:
 *
 * @author: huwei
 * @date: 2019-10-06
 */
public class Rectangle extends AbstractShape {

    public Rectangle() {
        this.type = "Rectangle";
    }

    @Override
    void draw() {
        System.out.println("draw rectangle");
    }
}
