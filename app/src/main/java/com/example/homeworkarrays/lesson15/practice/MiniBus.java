package com.example.homeworkarrays.lesson15.practice;

public class MiniBus implements Runnable {
    MinibusQueue queue;

    public MiniBus(MinibusQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        queue.deletePeople();
    }

}
