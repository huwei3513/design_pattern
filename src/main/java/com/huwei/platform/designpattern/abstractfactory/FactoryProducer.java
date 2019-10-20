package com.huwei.platform.designpattern.abstractfactory;

/**
 * Description:
 *
 * @author: huwei
 * @date: 2019-05-02
 */
public class FactoryProducer {

    public static final String COLOR = "color";
    public static final String SHAPE = "shape";

    AbstractFactory getFactory(String name) {
        if (COLOR.equals(name)) {
            return new ColorFactory();
        } else if (SHAPE.equals(name)) {
            return new ShapeFactory();
        }
        return null;
    }
}
