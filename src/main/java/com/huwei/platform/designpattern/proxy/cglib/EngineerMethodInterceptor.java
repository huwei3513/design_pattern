package com.huwei.platform.designpattern.proxy.cglib;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Description:
 *
 * @author: huwei
 * @date: 2019-10-06
 */
public class EngineerMethodInterceptor implements MethodInterceptor {

    private Object target;

    public EngineerMethodInterceptor() {
        this.target = new Engineer();
    }

    @Override
    public Object intercept(Object o,Method method,Object[] objects,MethodProxy methodProxy) throws Throwable {
        System.out.println("###   before invocation");
        Object result = method.invoke(target,objects);
        System.out.println("###   end invocation");
        return result;
    }
}
