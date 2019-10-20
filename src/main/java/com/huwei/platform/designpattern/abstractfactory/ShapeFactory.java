package com.huwei.platform.designpattern.abstractfactory;

/**
 * Description:
 *
 * @author: huwei
 * @date: 2019-05-02
 */
public class ShapeFactory extends AbstractFactory {

    public static final String CIRCLE = "circle";
    public static final String SQUARE = "square";
    public static final String RECTANGLE = "rectangle";

    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
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
