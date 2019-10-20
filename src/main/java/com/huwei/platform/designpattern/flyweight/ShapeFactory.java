package com.huwei.platform.designpattern.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Description:
 *
 * @author: huwei
 * @date: 2019-10-06
 */
public class ShapeFactory {

    private static final Map<String, Shape> circleMap = new HashMap<>();

    public static Shape getCircle(String color) {
        Circle circle = (Circle) circleMap.get(color);
        if (null == circle) {
            circle = new Circle(color);
            circleMap.put(color,circle);
            System.out.println("Creating circle of color : " + color);
        }
        return circle;
    }
}
