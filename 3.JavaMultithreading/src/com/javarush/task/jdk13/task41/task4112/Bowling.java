package com.javarush.task.jdk13.task41.task4112;

import java.util.*;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ThreadLocalRandom;


public class Bowling {

    private final Queue<Track> tracks = new ConcurrentLinkedDeque<>();
    private final Queue<PairOfShoes> shoesShelf = new ConcurrentLinkedDeque<>();

    public Bowling(int tracksNumber) {

        for (int i = 0; i < tracksNumber; i++) {
            tracks.add(new Track(i+1));

        }
        for (int i = 0; i < 50; i++) {
            int random = ThreadLocalRandom.current().nextInt(38, 46);
            shoesShelf.add(new PairOfShoes(random));
        }
    }

    public synchronized Track acquireTrack() {
        if (tracks.isEmpty()) {
            return null;
        }
        Track remove = tracks.remove();
        remove.setPrice(100 - tracks.size() * 10);
        return remove;
    }

    public synchronized void releaseTrack(Track track) {
        tracks.add(track);
        System.out.printf("C дорожки №%d сняли бронь\n", track.getNumber());
    }

    public synchronized Set<PairOfShoes> acquireShoes(int number) {
        Set<PairOfShoes> shoes = new HashSet<>();
        if (shoesShelf.size() < number) {
            return null;
        }
        for (int i = 0; i < number; i++) {

            PairOfShoes peek = shoesShelf.poll();
            shoesShelf.remove(peek);
            shoes.add(peek);
        }
        return shoes;
    }

    public synchronized void releaseShoes(Set<PairOfShoes> shoes) {
        for (PairOfShoes shoe : shoes) {
            shoesShelf.add(shoe);
        }
        System.out.printf("В гардероб вернули %d пар обуви\n", shoes.size());
    }
}
