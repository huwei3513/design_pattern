package com.huwei.platform.designpattern.observer;

/**
 * Description:
 *
 * @author: huwei
 * @date: 2019-10-12
 */
public class OctalObserver extends AbstractObserver {

    public OctalObserver(Subject subject) {
        this.subject = subject;
        subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Octal String: "
                + Integer.toOctalString(subject.getState()));
    }
}
