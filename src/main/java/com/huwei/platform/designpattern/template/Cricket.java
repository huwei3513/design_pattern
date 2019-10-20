package com.huwei.platform.designpattern.template;

/**
 * Description:
 *
 * @author: huwei
 * @date: 2019-10-13
 */
public class Cricket extends AbstractGame {

    @Override
    void initialize() {
        System.out.println("Cricket Game Initialized! Start playing.");
    }

    @Override
    void startPlay() {
        System.out.println("Cricket Game Started. Enjoy the game!");
    }

    @Override
    void endPlay() {
        System.out.println("Cricket Game Finished!");
    }
}
