package com.huwei.platform.designpattern.proxy.java;

import java.lang.reflect.Proxy;

/**
 * Description:
 *
 * @author: huwei
 * @date: 2019-10-06
 */
public class Client {

    public static void main(String[] args) {
        Subject proxy = (Subject) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(),
                new Class[]{Subject.class}, new SubjectInvocationHandler(new RealSubject()));
        proxy.sellBooks();
        proxy.speak();

        proxy.sellBooks();
        proxy.speak();
    }
}
