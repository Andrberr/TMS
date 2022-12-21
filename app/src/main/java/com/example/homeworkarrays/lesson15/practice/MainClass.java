package com.example.homeworkarrays.lesson15.practice;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество мест в маршрутке:");
        int placeCount = in.nextInt();
        MinibusQueue queue=new MinibusQueue(placeCount);
        People people = new People(queue);
        MiniBus minibus = new MiniBus(queue);
        new Thread(people).start();
        new Thread(minibus).start();
    }
}
