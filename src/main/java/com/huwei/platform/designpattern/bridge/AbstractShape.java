package com.huwei.platform.designpattern.bridge;

/**
 * Description:
 *
 * @author: huwei
 * @date: 2019-10-06
 */
public abstract class AbstractShape {

    protected DrawBridge drawBridge;

    public AbstractShape(DrawBridge drawBridge) {
        this.drawBridge = drawBridge;
    }

    /**
     * 画图
     */
    public abstract void draw();
}
