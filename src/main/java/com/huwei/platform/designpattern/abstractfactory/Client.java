package com.huwei.platform.designpattern.abstractfactory;

/**
 * Description:
 *
 * @author: huwei
 * @date: 2019-05-02
 */
public class Client {

    public static void main(String[] args) {
        FactoryProducer producer = new FactoryProducer();
        AbstractFactory shapeFactory = producer.getFactory(FactoryProducer.SHAPE);
        Shape circle = shapeFactory.getShape(ShapeFactory.CIRCLE);
        circle.draw();
        Shape square = shapeFactory.getShape(ShapeFactory.SQUARE);
        square.draw();
        Shape rectangle = shapeFactory.getShape(ShapeFactory.RECTANGLE);
        rectangle.draw();
        AbstractFactory colorFactory = producer.getFactory(FactoryProducer.COLOR);
        Color red = colorFactory.getColor(ColorFactory.RED);
        red.fill();
        Color green = colorFactory.getColor(ColorFactory.GREEN);
        green.fill();
        Color blue = colorFactory.getColor(ColorFactory.BLUE);
        blue.fill();
    }
}
