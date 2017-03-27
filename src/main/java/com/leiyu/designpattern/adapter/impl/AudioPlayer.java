package com.leiyu.designpattern.adapter.impl;

import com.leiyu.designpattern.adapter.MediaPlayer;

/**
 * Created by wh on 2017/3/13.
 */
public class AudioPlayer implements MediaPlayer {

    private MediaPlayer mediaAdapter = null;

    public AudioPlayer(){
        mediaAdapter = new MediaAdapter();
    }

    public void play(String audioType, String fileName) {
        if("mp3".equalsIgnoreCase(audioType)){
            System.out.println("Playing vlc file. Name: "+ fileName);
        }else{
            mediaAdapter.play(audioType,fileName);
        }
    }
}
