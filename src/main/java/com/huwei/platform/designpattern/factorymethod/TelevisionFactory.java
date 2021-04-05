package com.huwei.platform.designpattern.factorymethod;

/**
 * @author huwei
 * @date 2021/4/5 16:24
 */
public class TelevisionFactory implements Factory {
    @Override
    public Product produce() {
        return new Television();
    }
}
