package com.example.homeworkarrays.lesson14.practice;

public class NewThread implements Runnable {
    @Override
    public void run(){
        for (int i=0; i<=100; i+=10){
            System.out.println(i);
            try{
                Thread.sleep(500);
            }catch(InterruptedException e){};
        }
    }
}
