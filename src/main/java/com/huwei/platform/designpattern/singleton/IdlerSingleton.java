package com.huwei.platform.designpattern.singleton;

/**
 * Description:
 *
 * @author: huwei
 * @date: 2019-10-05
 */
public class IdlerSingleton {

    private static volatile IdlerSingleton singleton = null;

    private IdlerSingleton() {
    }

    public static synchronized IdlerSingleton getInstance() {
        if (null == singleton) {
            singleton = new IdlerSingleton();
        }
        return singleton;
    }

    public void work() {
        System.out.println("IdlerSingleton do some work!");
    }
}
