package com.huwei.platform.designpattern.prototype;

/**
 * Description:
 *
 * @author: huwei
 * @date: 2019-10-06
 */
public class Square extends AbstractShape {

    public Square() {
        this.type = "Square";
    }

    @Override
    void draw() {
        System.out.println("draw square");
    }
}
