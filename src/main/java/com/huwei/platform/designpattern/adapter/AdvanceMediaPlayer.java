package com.huwei.platform.designpattern.adapter;

/**
 * Description:
 *
 * @author: huwei
 * @date: 2019-10-06
 */
public interface AdvanceMediaPlayer {

    /**
     * 播放MP4
     *
     * @param fileName 文件名
     */
    void playMp4(String fileName);

    /**
     * 播放vlc
     *
     * @param fileName 文件名
     */
    void playVlc(String fileName);
}
