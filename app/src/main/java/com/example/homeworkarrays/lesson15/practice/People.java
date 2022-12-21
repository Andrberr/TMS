package com.example.homeworkarrays.lesson15.practice;

public class People implements Runnable{
    MinibusQueue queue;
    public People(MinibusQueue queue){
      this.queue = queue;
    }
    @Override
    public void run(){
//        for (int i=0; i<6; i++){
        while (true) {
            queue.put();
        }
    }
}
