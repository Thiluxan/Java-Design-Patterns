package com.thiluxan.observer;

public class TiffConverter implements Observer{
    @Override
    public void notify(String filepath) {
        System.out.println("TIFF Converter");
    }
}
