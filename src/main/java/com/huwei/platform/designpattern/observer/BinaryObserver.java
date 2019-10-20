package com.huwei.platform.designpattern.observer;

/**
 * Description:
 *
 * @author: huwei
 * @date: 2019-10-12
 */
public class BinaryObserver extends AbstractObserver {

    public BinaryObserver(Subject subject) {
        this.subject = subject;
        subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Binary String: "
                + Integer.toBinaryString(subject.getState()));
    }
}
