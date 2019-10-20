package com.huwei.platform.designpattern.mediator;

/**
 * Description:
 *
 * @author: huwei
 * @date: 2019-10-08
 */
public class Client {

    public static void main(String[] args) {
        User robert = new User("Robert");
        User john = new User("John");

        robert.sendMessage("Hi! John!");
        john.sendMessage("Hello! Robert!");
    }
}
