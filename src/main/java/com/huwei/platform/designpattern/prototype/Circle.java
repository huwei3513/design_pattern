package com.huwei.platform.designpattern.prototype;

/**
 * Description:
 *
 * @author: huwei
 * @date: 2019-10-06
 */
public class Circle extends AbstractShape {
    public Circle() {
        this.type = "Circle";
    }

    @Override
    void draw() {
        System.out.println("draw square");
    }
}
