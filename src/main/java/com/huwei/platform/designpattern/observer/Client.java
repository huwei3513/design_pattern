package com.huwei.platform.designpattern.observer;

/**
 * Description:
 *
 * @author: huwei
 * @date: 2019-10-12
 */
public class Client {

    public static void main(String[] args) {
        Subject subject = new Subject();
        new HexObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);
        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);
    }
}
