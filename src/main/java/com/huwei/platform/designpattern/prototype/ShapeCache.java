package com.huwei.platform.designpattern.prototype;

import java.util.Hashtable;

/**
 * Description:
 *
 * @author: huwei
 * @date: 2019-10-06
 */
public class ShapeCache {

    public static Hashtable<String, AbstractShape> shapeCache = new Hashtable<>(3);

    public static AbstractShape getShape(String shapeId) {
        AbstractShape cachedShape = shapeCache.get(shapeId);
        return (AbstractShape) cachedShape.clone();
    }

    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        shapeCache.put(circle.getId(),circle);

        Square square = new Square();
        square.setId("2");
        shapeCache.put(square.getId(),square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapeCache.put(rectangle.getId(),rectangle);
    }
}
