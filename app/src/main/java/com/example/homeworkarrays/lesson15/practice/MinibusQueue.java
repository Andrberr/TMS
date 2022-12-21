package com.example.homeworkarrays.lesson15.practice;

import java.util.ArrayDeque;

public class MinibusQueue {
    int minibusCount;
    ArrayDeque<String> queuePeople= new ArrayDeque<>();
    public MinibusQueue(int minibusCount){
        this.minibusCount = minibusCount;
    }
    public synchronized void deletePeople() {
        while (queuePeople.size() < minibusCount) {
            try {
                wait();
            }
            catch (InterruptedException e) {
            }
        }
        for (int i=0; i<minibusCount; i++){
            queuePeople.poll();
        }
        System.out.println("Маршрутка поехала.");
        notify();
    }
    public synchronized void put() {
        while (queuePeople.size() >= minibusCount + 2) {
            try {
                wait();
            }
            catch (InterruptedException e) {
            }
        }
        queuePeople.add("LLL");
        System.out.println("Количество мест в очереди = " + queuePeople.size());
        notify();
    }
}
