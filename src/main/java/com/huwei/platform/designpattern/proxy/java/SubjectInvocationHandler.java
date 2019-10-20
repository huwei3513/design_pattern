package com.huwei.platform.designpattern.proxy.java;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Description:
 *
 * @author: huwei
 * @date: 2019-10-06
 */
public class SubjectInvocationHandler implements InvocationHandler {

    Subject subject;

    public SubjectInvocationHandler() {
        this.subject = new RealSubject();
    }

    @Override
    public Object invoke(Object proxy,Method method,Object[] args) throws Throwable {
        System.out.println("调用代理类");
        if (method.getName().equals("sellBooks")) {
            int invoke = (int) method.invoke(subject,args);
            System.out.println("调用的是卖书的方法");
            return invoke;
        } else {
            String string = (String) method.invoke(subject,args);
            System.out.println("调用的是说话的方法");
            return string;
        }
    }
}
