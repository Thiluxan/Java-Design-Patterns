package com.thiluxan.observer;

import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;

public class Subject {

    private List<Observer> observers = new ArrayList<>();

    public void addNewObserver(Observer observer){
        observers.add(observer);
    }

    public void removeObserver(Observer observer){
        observers.remove(observer);
    }

    public void notifyObservers(String filePath){

        for (Observer observer : observers) {
            observer.notify(filePath);
        }
    }

    public void start() throws IOException, InterruptedException {
        WatchService watchService = FileSystems.getDefault().newWatchService();
        Path path = Paths.get("C:\\Users\\HP\\Documents\\design patterns\\observer\\converter");
        path.register(watchService,StandardWatchEventKinds.ENTRY_CREATE);
        WatchKey watchKey;

        while ((watchKey = watchService.take()) != null) {
            for (WatchEvent<?> event : watchKey.pollEvents()) {
                notifyObservers(path.toString());
            }
            watchKey.reset();
        }
    }

}
