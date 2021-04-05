package com.huwei.platform.designpattern.abstractfactory1;

/**
 * @author huwei
 * @date 2021/4/5 17:30
 */
public class DellKeyboard implements KeyBoard{
    @Override
    public void click() {
        System.out.println("-->Dell keyboard clicked...");
    }
}
