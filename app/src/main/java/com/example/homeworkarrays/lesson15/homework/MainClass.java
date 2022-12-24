package com.example.homeworkarrays.lesson15.homework;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainClass {
    static Thread bigThread;
    static Thread fastThread;
    private static final int BIG_ELEVATOR_CAPACITY = 10;
    private static final int FAST_ELEVATOR_CAPACITY = 6;

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        int peopleAmount = inputAmountOfPeople();
        if (peopleAmount != 0) {
            createElevators(peopleAmount);
            while (true) {
                if (!bigThread.isAlive() && !fastThread.isAlive()) {
                    peopleAmount = inputAmountOfPeople();
                    if (peopleAmount == 0) break;
                    createElevators(peopleAmount);
                }
            }
        }
    }

    public static void createElevators(int peopleAmount) {
        BigElevator bigElevator = new BigElevator(peopleAmount, BIG_ELEVATOR_CAPACITY);
        FastElevator fastElevator = new FastElevator(peopleAmount, FAST_ELEVATOR_CAPACITY);
        bigThread = new Thread(bigElevator);
        fastThread = new Thread(fastElevator);
        fastThread.start();
        bigThread.start();
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
