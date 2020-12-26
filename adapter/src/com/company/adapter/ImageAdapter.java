package com.company.adapter;

import com.company.lib.Image;

public class ImageAdapter implements MediaFile{

    private Image image = new Image();
    @Override
    public void play() {
        image.show();
    }
}
