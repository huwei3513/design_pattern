package com.huwei.platform.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Description:
 *
 * @author: huwei
 * @date: 2019-10-12
 */
public class Subject {

    private List<AbstractObserver> observers = new ArrayList<>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(AbstractObserver observer) {
        this.observers.add(observer);
    }

    public void notifyAllObservers() {
        for (AbstractObserver observer : observers) {
            observer.update();
        }
    }
}
