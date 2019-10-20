package com.huwei.platform.designpattern.adapter;

/**
 * Description:
 *
 * @author: huwei
 * @date: 2019-10-06
 */
public class AudioPlayer implements MediaPlayer {

    private MediaAdapter mediaAdapter;

    @Override
    public void play(String type,String fileName) {
        if (type.equals(MediaType.MEDIA_MP3)) {
            System.out.println("play mp3:" + fileName);
        } else {
            mediaAdapter = new MediaAdapter(type);
            mediaAdapter.play(type,fileName);
        }
    }
}
