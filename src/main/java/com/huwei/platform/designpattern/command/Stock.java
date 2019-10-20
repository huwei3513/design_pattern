package com.huwei.platform.designpattern.command;

/**
 * Description:
 *
 * @author: huwei
 * @date: 2019-10-07
 */
public class Stock {

    private String name = "ABC";
    private int quantity = 100;

    public void buy() {
        System.out.println("Stock [ Name: " + name + ", Quantity: " + quantity + " ] bought");
    }

    public void sell() {
        System.out.println("Stock [ Name: " + name + ", Quantity: " + quantity + " ] sold");
    }
}
