package com.huwei.platform.designpattern.memento;

/**
 * Description:
 *
 * @author: huwei
 * @date: 2019-10-08
 */
public class Memento {

    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
