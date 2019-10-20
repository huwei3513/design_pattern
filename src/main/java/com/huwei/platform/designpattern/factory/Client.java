package com.huwei.platform.designpattern.factory;

/**
 * Description:
 *
 * @author: huwei
 * @date: 2019-05-02
 */
public class Client {

    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();
        Shape circle = factory.getShape(ShapeFactory.CIRCLE);
        circle.draw();
        Shape square = factory.getShape(ShapeFactory.SQUARE);
        square.draw();
        Shape rectangle = factory.getShape(ShapeFactory.RECTANGLE);
        rectangle.draw();
    }
}
