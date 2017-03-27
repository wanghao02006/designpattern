package com.leiyu.designpattern.adapter.impl;

import com.leiyu.designpattern.adapter.AdvancedMediaPlayer;

/**
 * Created by wh on 2017/3/13.
 */
public class VLCPlayer implements AdvancedMediaPlayer {
    public void playVLC(String fileName) {
        System.out.println("Playing vlc file. Name: "+ fileName);
    }

    public void playMp4(String fileName) {

    }
}
