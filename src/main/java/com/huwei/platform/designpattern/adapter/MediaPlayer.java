package com.huwei.platform.designpattern.adapter;

/**
 * Description:
 *
 * @author: huwei
 * @date: 2019-10-06
 */
public interface MediaPlayer {

    /**
     * 播放
     *
     * @param type     媒体类型
     * @param fileName 文件名
     */
    void play(String type,String fileName);
}
