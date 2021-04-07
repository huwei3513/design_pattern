package com.huwei.platform.designpattern.adapter1;

/**
 * Description:
 *
 * @author: huwei
 * @date: 2021-04-07
 */
public class Client {

    public static void main(String[] args) {
        Computer computer = new ThinkPadComputer();
        Usb usb = new UsbImpl();
        System.out.println(computer.readUsb(usb));
        System.out.println("====================================");
        TfCard tfCard = new TfCardImpl();
        Usb tf2UsbAdapter = new Tf2UsbAdapter(tfCard);
        System.out.println(computer.readUsb(tf2UsbAdapter));
    }
}
