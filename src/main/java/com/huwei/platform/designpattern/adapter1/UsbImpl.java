package com.huwei.platform.designpattern.adapter1;

/**
 * Description:
 *
 * @author: huwei
 * @date: 2021-04-07
 */
public class UsbImpl implements Usb {
    @Override
    public String readUsb() {
        return "sdcard read a msg :hello word SD";
    }

    @Override
    public int writeUsb(String msg) {
        System.out.println("sd card write msg : " + msg);
        return 1;
    }
}
