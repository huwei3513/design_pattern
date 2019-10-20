package com.huwei.platform.designpattern.decorator;

/**
 * Description:
 *
 * @author: huwei
 * @date: 2019-10-06
 */
public class Client {

    public static void main(String[] args) {
        Shape circle = new Circle();
        AbstractShapeDecorator redCircle = new RedShapeDecorator(new Circle());
        AbstractShapeDecorator redRectangle = new RedShapeDecorator(new Rectangle());

        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();
    }
}
