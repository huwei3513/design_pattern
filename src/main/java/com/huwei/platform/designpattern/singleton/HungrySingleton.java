package com.huwei.platform.designpattern.singleton;

/**
 * Description:
 *
 * @author: huwei
 * @date: 2019-05-03
 */
public class HungrySingleton {

    private HungrySingleton() {
    }

    private static final HungrySingleton instance = new HungrySingleton();

    public static HungrySingleton getInstance() {
        return instance;
    }

    public void work() {
        System.out.println("HungrySingleton do some work!");
    }
}
