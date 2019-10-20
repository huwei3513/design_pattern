package com.huwei.platform.designpattern.Interpreter;

/**
 * Description:
 *
 * @author: huwei
 * @date: 2019-10-07
 */
public interface Expression {

    /**
     * 解释
     *
     * @param context
     * @return
     */
    boolean interpret(String context);
}
