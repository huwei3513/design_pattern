package com.huwei.platform.designpattern.abstractfactory1;

/**
 * @author huwei
 * @date 2021/4/5 17:29
 */
public class DellMouse implements Mouse {
    @Override
    public void click() {
        System.out.println("-->Dell mouse clicked...");
    }
}
