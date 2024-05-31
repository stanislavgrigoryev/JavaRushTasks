package com.javarush.task.task27.task2712.ad;


import java.util.logging.Level;
import java.util.logging.Logger;

public class AdvertisementManager {

    final AdvertisementStorage storage = AdvertisementStorage.getInstance();
    private int timeSeconds;

    public AdvertisementManager(int timeSeconds) {
        this.timeSeconds = timeSeconds;
    }

    public void processVideos() {
        if (storage.list().isEmpty()) {
            throw new NoVideoAvailableException();
        }
    }
}
