package com.huwei.platform.designpattern.flyweight;

import java.util.Random;

/**
 * Description:
 *
 * @author: huwei
 * @date: 2019-10-06
 */
public class Client {

    private static final String[] COLORS =
            {"Red","Green","Blue","White","Black"};

    public static void main(String[] args) {
        for (int i = 0; i < 20; ++i) {
            Circle circle =
                    (Circle) ShapeFactory.getCircle(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(100);
            circle.draw();
        }
    }

    private static String getRandomColor() {
        return COLORS[new Random().nextInt(COLORS.length)];
    }

    private static int getRandomX() {
        return new Random().nextInt(100);
    }

    private static int getRandomY() {
        return new Random().nextInt(100);
    }
}
