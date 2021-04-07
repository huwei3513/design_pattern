package com.huwei.platform.designpattern.adapter1;

/**
 * Description:
 *
 * @author: huwei
 * @date: 2021-04-07
 */
public class TfCardImpl implements TfCard {
    @Override
    public String readTf() {
        String msg = "tf card reade msg : hello word tf card";
        return msg;
    }

    @Override
    public int writeTf(String msg) {
        System.out.println("tf card write a msg : " + msg);
        return 1;
    }
}
