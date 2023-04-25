package com.huwei.platform.designpattern.singleton;

/**
 * @author huwei
 * @date 2023/4/24
 */
public class ExecuteThread implements Runnable {
    @Override
    public void run() {
        IdlerSingleton singleton = IdlerSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + ":" + singleton);
    }
}
