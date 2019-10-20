package com.huwei.platform.designpattern.abstractfactory;

/**
 * Description:
 *
 * @author: huwei
 * @date: 2019-05-02
 */
public class Red implements Color {

    @Override
    public void fill() {
        System.out.println("fill red!");
    }
}
