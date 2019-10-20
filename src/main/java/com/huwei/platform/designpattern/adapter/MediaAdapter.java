package com.huwei.platform.designpattern.adapter;

/**
 * Description:
 *
 * @author: huwei
 * @date: 2019-10-06
 */
public class MediaAdapter implements MediaPlayer {

    private AdvanceMediaPlayer player;

    public MediaAdapter(String type) {
        if (type.equals(MediaType.MEDIA_MP4)) {
            player = new Mp4Player();
        } else if (type.equals(MediaType.MEDIA_VLC)) {
            player = new VlcPlayer();
        }
    }

    @Override
    public void play(String type,String fileName) {
        if (type.equals(MediaType.MEDIA_MP4)) {
            player.playMp4(fileName);
        } else if (type.equals(MediaType.MEDIA_VLC)) {
            player.playVlc(fileName);
        } else {
            System.out.println("媒体类型不支持！");
        }
    }
}
