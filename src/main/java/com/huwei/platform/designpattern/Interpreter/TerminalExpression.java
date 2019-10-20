package com.huwei.platform.designpattern.Interpreter;

/**
 * Description:
 *
 * @author: huwei
 * @date: 2019-10-07
 */
public class TerminalExpression implements Expression {

    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        return context.contains(data);
    }
}
