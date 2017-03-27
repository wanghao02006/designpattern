package com.leiyu.designpattern.adapter.impl;

import com.leiyu.designpattern.adapter.AdvancedMediaPlayer;
import com.leiyu.designpattern.adapter.MediaPlayer;

/**
 * Created by wh on 2017/3/13.
 */
public class MediaAdapter implements MediaPlayer {

    AdvancedMediaPlayer mp4Player = null;
    AdvancedMediaPlayer vlcPlayer = null;

    public MediaAdapter() {
        this.mp4Player = new Mp4Player();
        this.vlcPlayer = new VLCPlayer();
    }

    public void play(String audioType, String fileName) {
        if("vlc".equalsIgnoreCase(audioType)){
            vlcPlayer.playVLC(fileName);
        }else if("mp4".equalsIgnoreCase(audioType)){
            mp4Player.playMp4(fileName);
        }else{
            System.out.println("no adapter!");
        }
    }
}
