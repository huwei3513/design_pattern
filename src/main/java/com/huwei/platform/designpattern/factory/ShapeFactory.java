package com.huwei.platform.designpattern.factory;

/**
 * Description:
 *
 * @author: huwei
 * @date: 2019-05-02
 */
public class ShapeFactory {

    public static final String CIRCLE = "circle";
    public static final String SQUARE = "square";
    public static final String RECTANGLE = "rectangle";

    public Shape getShape(String type) {
        if (CIRCLE.equals(type)) {
            return new Circle();
        } else if (SQUARE.equals(type)) {
            return new Square();
        } else if (RECTANGLE.equals(type)) {
            return new Rectangle();
        }
        return null;
    }
}
