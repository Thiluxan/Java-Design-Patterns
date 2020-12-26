package com.thiluxan.observer;

public class PngConverter implements Observer{
    @Override
    public void notify(String filepath) {
        System.out.println("PNG converter");
    }
}
