package com.example.homeworkarrays.lesson11.practice;

import java.util.PriorityQueue;
import java.util.Scanner;

public class QueueWork {
    static PriorityQueue<Person> queue = new PriorityQueue<Person>();
    public static void main(String[] args) {
        queue.add(new Person("Andrey"));
        queue.add(new Person("Dima"));
        queue.add(new Person("Nekit"));
        queue.add(new Person("Egor"));

        System.out.println("Введите число сидений в маршрутке:");
        Scanner in = new Scanner(System.in);
        int seatNum = in.nextInt();
        boolean isFull;
        int size = queue.size();
        if (size < seatNum) {
            System.out.println("Маршрутка ждёт заполнения.");
            isFull = false;
        } else isFull = true;
        for (int i=1; i<=seatNum; i++){
            queue.poll();
        }

        if (!isFull) {
            int operation;
            do {
                System.out.println("Введите 1 , чтобы добавить в маршрутку.");
                System.out.println("Введите 2, чтобы маршрутка поехала.");
                operation = in.nextInt();
                if (operation == 1) {
                   size++;
                   if (size == seatNum) isFull = true;
                }
                else isFull = true;
            } while(!isFull);
        }
        System.out.println("Маршрутка поехала.");
    }

    public static void addPassenger(String name){
        queue.add(new Person(name));
    }
}
