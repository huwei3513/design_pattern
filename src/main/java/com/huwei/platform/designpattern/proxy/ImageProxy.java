package com.huwei.platform.designpattern.proxy;

/**
 * Description:
 *
 * @author: huwei
 * @date: 2019-10-06
 */
public class ImageProxy implements Image {

    private Image realImage;
    private String fileName;

    public ImageProxy(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (null == realImage) {
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
