package com.company.adapter;

public class MP3 implements MediaFile{
    @Override
    public void play() {
        System.out.println("Playing MP3 File");
    }
}
