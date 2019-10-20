package com.huwei.platform.designpattern.strategy;

/**
 * Description:
 *
 * @author: huwei
 * @date: 2019-10-13
 */
public class OperationSubstract implements Strategy {

    @Override
    public int doOperation(int num1,int num2) {
        return num1 - num2;
    }
}
