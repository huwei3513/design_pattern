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
        if (SingletonHolder.INSTANCE != null) {
            throw new RuntimeException("不允许反射构造对象");
        }
    }

    public static StaticSingleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

    public void work() {
        System.out.println("StaticSingleton do some work!");
    }

    public static void main(String[] args) {
        StaticSingleton singleton = StaticSingleton.getInstance();
        singleton.work();
    }
}
