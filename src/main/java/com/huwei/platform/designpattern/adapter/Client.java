package com.huwei.platform.designpattern.adapter;

/**
 * Description:
 *
 * @author: huwei
 * @date: 2019-10-06
 */
public class Client {

    public static void main(String[] args) {
        AudioPlayer player = new AudioPlayer();
        player.play(MediaType.MEDIA_MP3,"aaa.mp3");
        player.play(MediaType.MEDIA_MP4,"bbb.mp4");
        player.play(MediaType.MEDIA_VLC,"ccc.vlc");
    }
}
