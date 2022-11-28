package com.example.homeworkarrays.lesson8.practice;

import java.util.Scanner;

public class Birzh {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество работников: ");
        int kol = in.nextInt();
        Worker[] workers = new Worker[kol];
        int chooseWorker;
        String namePi = "P", namePr = "Pr", nameT = "T", nameD = "D";
        for (int i = 0; i < workers.length; i++) {
            chooseWorker = (int) (Math.random() * 4 + 1);
            switch (chooseWorker) {
                case 1: {
                    workers[i] = new Pilot(namePi, (int) (Math.random() * 10 + 20), (int) (Math.random() * 5 + 3));
                    namePi += "pi";
                    break;
                }
                case 2: {
                    workers[i] = new Programmer(namePr, (int) (Math.random() * 10 + 20), (int) (Math.random() * 5 + 3));
                    namePr += "pr";
                    break;
                }
                case 3: {
                    workers[i] = new Teacher(nameT, (int) (Math.random() * 10 + 20), (int) (Math.random() * 5 + 3));
                    nameT += "t";
                    break;
                }
                case 4: {
                    workers[i] = new Doctor(nameD, (int) (Math.random() * 10 + 20), (int) (Math.random() * 5 + 3));
                    nameD += "d";
                    break;
                }
            }
        }

        for (Worker worker : workers) {
            System.out.println("Меня зовут " + worker.getName() + ", Мне " + worker.getAge() + ", Я " + worker.getSpecialization() + ", Опыт " + worker.getExperience() + " лет.");
        }
    }
}
