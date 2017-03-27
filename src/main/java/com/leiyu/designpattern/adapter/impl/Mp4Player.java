package com.leiyu.designpattern.adapter.impl;

import com.leiyu.designpattern.adapter.AdvancedMediaPlayer;

/**
 * Created by wh on 2017/3/13.
 */
public class Mp4Player implements AdvancedMediaPlayer {
    public void playVLC(String fileName) {

    }

    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: "+ fileName);
    }
}
