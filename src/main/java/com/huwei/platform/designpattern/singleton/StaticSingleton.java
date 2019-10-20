package com.huwei.platform.designpattern.singleton;

/**
 * Description:
 *
 * @author: huwei
 * @date: 2019-10-05
 */
public class StaticSingleton {

    private static class SingletonHolder {
        private static final StaticSingleton INSTANCE = new StaticSingleton();
    }

    private StaticSingleton() {
    }

    public static StaticSingleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

    public void work() {
        System.out.println("StaticSingleton do some work!");
    }
}
