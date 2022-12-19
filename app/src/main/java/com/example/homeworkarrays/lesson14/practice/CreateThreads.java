package com.example.homeworkarrays.lesson14.practice;

public class CreateThreads {
    public static void main(String[] args) {
        Runnable fir = new NewThread();
        Thread firThread = new Thread(fir);
        firThread.start();

        Runnable sec = new NewThread();
        Thread secThread = new Thread(sec);
        secThread.start();

        Runnable third = new NewThread();
        Thread thirdThread = new Thread(third);
        thirdThread.start();
    }
}
