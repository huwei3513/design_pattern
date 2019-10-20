package com.huwei.platform.designpattern.bridge;

/**
 * Description:
 *
 * @author: huwei
 * @date: 2019-10-06
 */
public class Circle extends AbstractShape {

    private int radius;
    private int x;
    private int y;

    public Circle(DrawBridge drawBridge,int radius,int x,int y) {
        super(drawBridge);
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw() {
        drawBridge.drawCircle(radius,x,y);
    }
}
