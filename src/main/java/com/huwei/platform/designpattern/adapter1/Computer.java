package com.huwei.platform.designpattern.adapter1;

/**
 * Description:
 *
 * @author: huwei
 * @date: 2021-04-07
 */
public interface Computer {
    String readUsb(Usb usb);

    int writeUsb(Usb usb,String msg);
}
