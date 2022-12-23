package com.example.homeworkarrays.lesson15.homework;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainClass {
    static Thread bigThread;
    static Thread fastThread;

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        int peopleAmount = inputAmountOfPeople();
        if (peopleAmount != 0) {
            Elevators elevators = new Elevators(peopleAmount);
            createElevators(elevators);
            while (true) {
                if (!bigThread.isAlive() && !fastThread.isAlive()) {
                    peopleAmount = inputAmountOfPeople();
                    if (peopleAmount == 0) break;
                    elevators = new Elevators(peopleAmount);
                    createElevators(elevators);
                }
            }
        }
    }

    public static void createElevators(Elevators elevators) {
        BigElevator bigElevator = new BigElevator(elevators);
        FastElevator fastElevator = new FastElevator(elevators);
        bigThread = new Thread(bigElevator);
        fastThread = new Thread(fastElevator);
        bigThread.start();
        fastThread.start();
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
