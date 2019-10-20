package com.huwei.platform.designpattern.decorator;

/**
 * Description:
 *
 * @author: huwei
 * @date: 2019-10-06
 */
public abstract class AbstractShapeDecorator implements Shape {

    protected Shape shape;

    public AbstractShapeDecorator(Shape shape) {
        this.shape = shape;
    }

    /**
     * 画图
     */
    @Override
    public abstract void draw();
}
