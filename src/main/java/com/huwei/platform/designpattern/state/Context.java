package com.huwei.platform.designpattern.state;

/**
 * Description:
 *
 * @author: huwei
 * @date: 2019-10-13
 */
public class Context {

    private State state;

    public Context() {
        state = null;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }
}
