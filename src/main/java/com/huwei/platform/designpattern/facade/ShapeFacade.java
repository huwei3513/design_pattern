package com.huwei.platform.designpattern.facade;

/**
 * Description:
 *
 * @author: huwei
 * @date: 2019-10-06
 */
public class ShapeFacade {

    private Shape circle;
    private Shape square;
    private Shape rectangle;

    public ShapeFacade() {
        this.circle = new Circle();
        this.square = new Square();
        this.rectangle = new Rectangle();
    }

    public void drawCircle() {
        circle.draw();
    }

    public void drawRectangle() {
        rectangle.draw();
    }

    public void drawSquare() {
        square.draw();
    }
}
