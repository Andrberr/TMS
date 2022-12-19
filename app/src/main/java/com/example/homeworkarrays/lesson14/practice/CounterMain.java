package com.example.homeworkarrays.lesson14.practice;

public class CounterMain {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Runnable runnable = () -> {
            synchronized (counter) {
            while (counter.getValue() < 30) {
                    counter.setValue(counter.getValue() + 1);
                    System.out.println(counter.getValue());
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                    }
                }
            }
        };
        Thread fir = new Thread(runnable);
        Thread sec = new Thread(runnable);
        Thread third = new Thread(runnable);
        fir.start();
        sec.start();
        third.start();
    }
}
