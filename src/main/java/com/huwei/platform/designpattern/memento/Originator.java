package com.huwei.platform.designpattern.memento;

/**
 * Description:
 *
 * @author: huwei
 * @date: 2019-10-08
 */
public class Originator {

    private String state;

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public Memento saveStateToMemento() {
        return new Memento(state);
    }

    public void getStateFromMemento(Memento Memento) {
        state = Memento.getState();
    }
}
