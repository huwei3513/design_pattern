package com.huwei.platform.designpattern.adapter;

/**
 * Description:
 *
 * @author: huwei
 * @date: 2019-10-06
 */
public class Mp4Player implements AdvanceMediaPlayer {

    @Override
    public void playMp4(String fileName) {
        System.out.println("play mp4:" + fileName);
    }

    @Override
    public void playVlc(String fileName) {
        System.out.println("----");
    }
}
