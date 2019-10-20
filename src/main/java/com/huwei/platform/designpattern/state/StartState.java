package com.huwei.platform.designpattern.state;

/**
 * Description:
 *
 * @author: huwei
 * @date: 2019-10-13
 */
public class StartState implements State {

    @Override
    public void doAction(Context context) {
        System.out.println("Player is in start state");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Start State";
    }
}
