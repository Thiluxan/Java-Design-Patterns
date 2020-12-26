package com.company;

import com.company.adapter.ImageAdapter;
import com.company.adapter.MP3;
import com.company.adapter.MP4;
import com.company.adapter.MediaFile;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String fileType = "image";

        MediaFile mediaFile = null;

        if(fileType.equals("mp3")){
            mediaFile = new MP3();
        }
        else if(fileType.equals("mp4")){
            mediaFile = new MP4();
        }
        else if(fileType.equals("image")){
            mediaFile = new ImageAdapter();
        }

        mediaFile.play();
    }
}
