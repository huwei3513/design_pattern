package com.huwei.platform.designpattern.bridge;

/**
 * Description:
 *
 * @author: huwei
 * @date: 2019-10-06
 */
public class RedCircle implements DrawBridge {

    @Override
    public void drawCircle(int radius,int x,int y) {
        System.out.println("Drawing Circle[ color: red, radius: "
                + radius + ", x: " + x + ", " + y + "]");
    }
}
