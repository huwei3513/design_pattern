package com.huwei.platform.designpattern.strategy;

/**
 * Description:
 *
 * @author: huwei
 * @date: 2019-10-13
 */
public class Context {

    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int num1,int num2) {
        return strategy.doOperation(num1,num2);
    }
}
