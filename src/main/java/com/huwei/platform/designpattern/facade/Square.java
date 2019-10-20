package com.huwei.platform.designpattern.facade;

/**
 * Description:
 *
 * @author: huwei
 * @date: 2019-05-02
 */
public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("draw a square！");
    }
}
