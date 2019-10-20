package com.huwei.platform.designpattern.strategy;

/**
 * Description:
 *
 * @author: huwei
 * @date: 2019-10-13
 */
public interface Strategy {

    /**
     * 执行动作
     *
     * @param num1
     * @param num2
     * @return
     */
    public int doOperation(int num1,int num2);
}
