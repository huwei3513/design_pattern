package com.huwei.platform.designpattern.singleton;

/**
 * Description:
 *
 * @author: huwei
 * @date: 2019-10-05
 */
public class DoubleCheckSingleton {

    private static volatile DoubleCheckSingleton singleton = null;

    private DoubleCheckSingleton() {
    }

    public static DoubleCheckSingleton getInstance() {
        if (null == singleton) {
            synchronized (DoubleCheckSingleton.class) {
                if (null == singleton) {
                    singleton = new DoubleCheckSingleton();
                }
            }
        }
        return singleton;
    }

    public void work() {
        System.out.println("DoubleCheckSingleton do some work!");
    }
}
