package com.huwei.platform.designpattern.bridge;

/**
 * Description:
 *
 * @author: huwei
 * @date: 2019-10-06
 */
public interface DrawBridge {

    /**
     * 画圆
     *
     * @param radius
     * @param x
     * @param y
     */
    void drawCircle(int radius,int x,int y);
}
