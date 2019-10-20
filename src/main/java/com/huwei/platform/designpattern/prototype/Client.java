package com.huwei.platform.designpattern.prototype;

/**
 * Description:
 *
 * @author: huwei
 * @date: 2019-10-06
 */
public class Client {
    public static void main(String[] args) {

        ShapeCache.loadCache();

        AbstractShape clonedShape = (AbstractShape) ShapeCache.getShape("1");
        System.out.println("Shape : " + clonedShape.getType());
        clonedShape.draw();

        AbstractShape clonedShape2 = (AbstractShape) ShapeCache.getShape("2");
        System.out.println("Shape : " + clonedShape2.getType());
        clonedShape2.draw();

        AbstractShape clonedShape3 = (AbstractShape) ShapeCache.getShape("3");
        System.out.println("Shape : " + clonedShape3.getType());
        clonedShape3.draw();

        AbstractShape clonedShape4 = (AbstractShape) ShapeCache.getShape("3");
        System.out.println(clonedShape4.equals(clonedShape3));
    }
}
