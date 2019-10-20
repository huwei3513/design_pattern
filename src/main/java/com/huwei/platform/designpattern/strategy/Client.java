package com.huwei.platform.designpattern.strategy;

/**
 * Description:
 *
 * @author: huwei
 * @date: 2019-10-13
 */
public class Client {

    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10,5));
        context.setStrategy(new OperationSubstract());
        System.out.println("10 - 5 = " + context.executeStrategy(10,5));
        context.setStrategy(new OperationMultiply());
        System.out.println("10 * 5 = " + context.executeStrategy(10,5));
    }
}
