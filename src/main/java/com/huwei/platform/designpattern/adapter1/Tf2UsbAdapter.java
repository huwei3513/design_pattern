package com.huwei.platform.designpattern.adapter1;

/**
 * Description:
 *
 * @author: huwei
 * @date: 2021-04-07
 */
public class Tf2UsbAdapter implements Usb {

    private TfCard tfCard;

    public Tf2UsbAdapter(TfCard tfCard) {
        this.tfCard = tfCard;
    }

    @Override
    public String readUsb() {
        System.out.println("adapter read tf card ");
        return tfCard.readTf();
    }

    @Override
    public int writeUsb(String msg) {
        System.out.println("adapter write tf card");
        return tfCard.writeTf(msg);
    }
}
