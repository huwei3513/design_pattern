package com.huwei.platform.designpattern.abstractfactory;

/**
 * Description:
 *
 * @author: huwei
 * @date: 2019-05-02
 */
public class ColorFactory extends AbstractFactory {

    public static final String RED = "red";
    public static final String GREEN = "green";
    public static final String BLUE = "blue";

    @Override
    public Color getColor(String color) {
        if (RED.equals(color)) {
            return new Red();
        } else if (GREEN.equals(color)) {
            return new Green();
        } else if (BLUE.equals(color)) {
            return new Blue();
        }
        return null;
    }

    @Override
    public Shape getShape(String type) {
        return null;
    }
}
