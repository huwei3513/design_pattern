package com.huwei.platform.designpattern.observer;

/**
 * Description:
 *
 * @author: huwei
 * @date: 2019-10-12
 */
public class HexObserver extends AbstractObserver {

    public HexObserver(Subject subject) {
        this.subject = subject;
        subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Hex String: "
                + Integer.toHexString(subject.getState()).toUpperCase());
    }
}
