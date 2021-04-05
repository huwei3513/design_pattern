package com.huwei.platform.designpattern.abstractfactory1;

/**
 * @author huwei
 * @date 2021/4/5 17:31
 */
public class HpKeyboard implements KeyBoard {
    @Override
    public void click() {
        System.out.println("-->HP keyboard clicked...");
    }
}
