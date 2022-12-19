package com.example.homeworkarrays.lesson14.practice;

public class MySecThread implements Runnable{
    @Override
    public void run(){
        for (int i=11; i<=20; i++){
            System.out.println(i);
        }
    }
}
