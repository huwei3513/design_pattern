package com.huwei.platform.designpattern.bridge;

/**
 * Description:
 *
 * @author: huwei
 * @date: 2019-10-06
 */
public class GreenCircle implements DrawBridge {

    @Override
    public void drawCircle(int radius,int x,int y) {
        System.out.println("Drawing Circle[ color: green, radius: "
                + radius + ", x: " + x + ", " + y + "]");
    }
}
