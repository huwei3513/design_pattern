package com.huwei.platform.designpattern.abstractfactory1;

/**
 * @author huwei
 * @date 2021/4/5 17:33
 */
public class client {

    public static void main(String[] args) {
        PcFactory dellFactory = new DellFactory();
        Mouse dellMouse = dellFactory.produceMouse();
        dellMouse.click();
        KeyBoard dellKeyboard = dellFactory.produceKeyBoard();
        dellKeyboard.click();

        PcFactory hpFactory = new HpFactory();
        Mouse hpMouse = hpFactory.produceMouse();
        hpMouse.click();
        KeyBoard hpKeyboard = hpFactory.produceKeyBoard();
        hpKeyboard.click();
    }
}
