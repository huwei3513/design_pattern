package com.huwei.platform.designpattern.abstractfactory1;

/**
 * @author huwei
 * @date 2021/4/5 17:32
 */
public class HpFactory implements PcFactory {
    @Override
    public Mouse produceMouse() {
        return new HpMouse();
    }

    @Override
    public KeyBoard produceKeyBoard() {
        return new HpKeyboard();
    }
}
