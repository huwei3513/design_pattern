package com.huwei.platform.designpattern.decorator;

/**
 * Description:
 *
 * @author: huwei
 * @date: 2019-10-06
 */
public class RedShapeDecorator extends AbstractShapeDecorator {

    public RedShapeDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        shape.draw();
        setRedBorder(shape);
    }

    private void setRedBorder(Shape shape) {
        System.out.println("set color red");
    }
}
