package com.huwei.platform.designpattern.singleton;

/**
 * Description:
 *
 * @author: huwei
 * @date: 2019-05-03
 */
public class Client1 {

    public static void main(String[] args) {
        Thread t1 = new Thread(new ExecuteThread());
        Thread t2 = new Thread(new ExecuteThread());
        t1.start();
        t2.start();
        System.out.println("end");
    }
}
