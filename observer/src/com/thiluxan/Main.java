package com.thiluxan;

import com.thiluxan.observer.Observer;
import com.thiluxan.observer.PngConverter;
import com.thiluxan.observer.Subject;
import com.thiluxan.observer.TiffConverter;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {
	// write your code here
        Observer pngConverter = new PngConverter();
        Observer tiffConverter = new TiffConverter();

        Subject subject = new Subject();

        subject.addNewObserver(pngConverter);
        subject.addNewObserver(tiffConverter);


        subject.start();
    }
}
