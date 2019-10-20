package com.huwei.platform.designpattern.proxy.java;

/**
 * Description:
 *
 * @author: huwei
 * @date: 2019-10-06
 */
public class RealSubject implements Subject {

    public RealSubject() {
        System.out.println("初始化");
    }

    @Override
    public int sellBooks() {
        System.out.println("卖书");
        return 1;
    }

    @Override
    public String speak() {
        System.out.println("说话");
        return "张三";
    }
}
