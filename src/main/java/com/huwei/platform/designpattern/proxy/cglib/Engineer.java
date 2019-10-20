package com.huwei.platform.designpattern.proxy.cglib;

/**
 * Description:
 *
 * @author: huwei
 * @date: 2019-10-06
 */
public class Engineer {

    public Engineer() {
        System.out.println("初始化");
    }

    public void eat() {
        System.out.println("工程师正在吃饭");
    }

    public final void work() {
        System.out.println("工程师正在工作");
    }

    private void play() {
        System.out.println("this engineer is playing game");
    }
}
