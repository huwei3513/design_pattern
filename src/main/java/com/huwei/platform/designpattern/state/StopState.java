package com.huwei.platform.designpattern.state;

/**
 * Description:
 *
 * @author: huwei
 * @date: 2019-10-13
 */
public class StopState implements State {

    @Override
    public void doAction(Context context) {
        System.out.println("Player is in stop state");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Stop State";
    }
}
