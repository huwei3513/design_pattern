package com.huwei.platform.designpattern.abstractfactory1;

/**
 * @author huwei
 * @date 2021/4/5 17:27
 */
public class DellFactory implements PcFactory {
    @Override
    public Mouse produceMouse() {
        return new DellMouse();
    }

    @Override
    public KeyBoard produceKeyBoard() {
        return new DellKeyboard();
    }
}
