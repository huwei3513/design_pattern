package com.huwei.platform.designpattern.singleton;

/**
 * Description:
 *
 * @author: huwei
 * @date: 2019-10-05
 */
public enum EnumSingleton {
    /**
     * 单例对象
     */
    INSTANCE;

    public void work() {
        System.out.println("EnumSingleton do some work!");
    }
}
