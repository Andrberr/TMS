package com.example.homeworkarrays.lesson14.practice;

public class ThreadPractice {
    public static void main(String[] args) {
        MyThread firThread = new MyThread();
        firThread.start();
        try{
            firThread.join();
        }catch (InterruptedException e){};

        Runnable mySecThread = new MySecThread();
        Thread secThread = new Thread(mySecThread);
        secThread.start();
        try{
            secThread.join();
        }catch (InterruptedException e){};

        Runnable runnable = () -> {
            for (int i=21; i<=30; i++){
                System.out.println(i);
            }
        };
        Thread thirdThread = new Thread(runnable);
        thirdThread.start();
    }
}
