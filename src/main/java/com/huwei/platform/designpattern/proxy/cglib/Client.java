package com.huwei.platform.designpattern.proxy.cglib;

import org.springframework.cglib.proxy.Enhancer;

/**
 * Description:
 *
 * @author: huwei
 * @date: 2019-10-06
 */
public class Client {

    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Engineer.class);
        enhancer.setCallback(new EngineerMethodInterceptor(new Engineer()));
        Engineer engineerProxy = (Engineer) enhancer.create();
        engineerProxy.eat();
        engineerProxy.work();
        engineerProxy.eat();
    }
}
