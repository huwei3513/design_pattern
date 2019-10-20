package com.huwei.platform.designpattern.template;

/**
 * Description:
 *
 * @author: huwei
 * @date: 2019-10-13
 */
public class Client {

    public static void main(String[] args) {
        AbstractGame game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }
}
