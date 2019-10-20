package com.huwei.platform.designpattern.proxy;

/**
 * Description:
 *
 * @author: huwei
 * @date: 2019-10-06
 */
public class Client {

    public static void main(String[] args) {
        Image image = new ImageProxy("test.jpg");
        image.display();
        System.out.println("");
        image.display();
    }
}
