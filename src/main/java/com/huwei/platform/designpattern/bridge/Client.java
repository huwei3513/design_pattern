package com.huwei.platform.designpattern.bridge;

/**
 * Description:
 *
 * @author: huwei
 * @date: 2019-10-06
 */
public class Client {

    public static void main(String[] args) {
        DrawBridge drawBridge = new RedCircle();
        Circle circle = new Circle(drawBridge,1,1,1);
        circle.draw();

        DrawBridge drawBridge1 = new GreenCircle();
        Circle circle1 = new Circle(drawBridge1,2,2,2);
        circle1.draw();
    }
}
