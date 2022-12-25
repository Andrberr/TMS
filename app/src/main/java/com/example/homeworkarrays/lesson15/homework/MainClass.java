package com.example.homeworkarrays.lesson15.homework;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {
        createElevators();
    }

    public static void createElevators() {
        int peopleAmount = inputAmountOfPeople();
        if (peopleAmount != 0) {
            Thread[] threads = startElevators(peopleAmount);
            while (true) {
                if (!threads[0].isAlive() && !threads[1].isAlive()) {
                    peopleAmount = inputAmountOfPeople();
                    if (peopleAmount == 0) break;
                    threads = startElevators(peopleAmount);
                }
            }
        }
    }

    public static Thread[] startElevators(int peopleAmount) {
        BigElevator bigElevator = new BigElevator(peopleAmount);
        FastElevator fastElevator = new FastElevator(peopleAmount);
        Thread[] threads = new Thread[2];
        threads[0] = new Thread(bigElevator);
        threads[1] = new Thread(fastElevator);
        threads[0].start();
        threads[1].start();
        return threads;
    }

    public static int inputAmountOfPeople() {
        Scanner in = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Введите количество людей: ");
                return in.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Некорректный ввод. Повторите попытку.");
                in.nextLine();
            }
        }
    }
}
