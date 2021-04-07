package com.huwei.platform.designpattern.adapter1;

/**
 * Description:
 *
 * @author: huwei
 * @date: 2021-04-07
 */
public class ThinkPadComputer implements Computer {
    @Override
    public String readUsb(Usb usb) {
        if (usb == null) {
            throw new NullPointerException("usb device is null");
        }
        return usb.readUsb();
    }

    @Override
    public int writeUsb(Usb usb,String msg) {
        if (usb == null) {
            throw new NullPointerException("usb device is null");
        }
        return usb.writeUsb(msg);
    }
}
