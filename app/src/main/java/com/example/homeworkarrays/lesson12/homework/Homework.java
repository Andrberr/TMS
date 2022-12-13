package com.example.homeworkarrays.lesson12.homework;

import java.util.HashMap;
import java.util.Scanner;

public class Homework {
    private static Scanner in = new Scanner(System.in);
    private static HashMap<String, Pet> animals = new HashMap<>();

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            generateAnimal();
        }
        System.out.println();
        printAnimalsInfo();
        System.out.println();
        deleteAnimal();
        System.out.println();
        printAnimalsInfo();
    }

    public static void generateAnimal() {
        int typeOfAnimal = (int) (Math.random() * 3) + 1;
        Pet animal;
        String animalName, animalBreed, animalFood;
        switch (typeOfAnimal) {
            case 1: {
                animalName = inputAnimalInfo("имя кота: ");
                animalBreed = inputAnimalInfo("породу кота: ");
                animalFood = inputAnimalInfo("еду кота: ");
                animal = new Cat(animalName, animalBreed, animalFood);
                break;
            }
            case 2: {
                animalName = inputAnimalInfo("имя собаки: ");
                animalBreed = inputAnimalInfo("породу собаки: ");
                animalFood = inputAnimalInfo("еду собаки: ");
                animal = new Dog(animalName, animalBreed, animalFood);
                break;
            }
            default: {
                animalName = inputAnimalInfo("имя лошади: ");
                animalBreed = inputAnimalInfo("породу лошади: ");
                animalFood = inputAnimalInfo("еду лошади: ");
                animal = new Horse(animalName, animalBreed, animalFood);
                break;
            }
        }
        animals.put(animal.getName(), animal);
    }

    private static String inputAnimalInfo(String characteristicString) {
        System.out.print("Введите " + characteristicString);
        return in.nextLine();
    }

    private static void printAnimalsInfo() {
        for (Pet pet : animals.values()) {
            pet.printInfo();
        }
    }

    private static void deleteAnimal() {
        System.out.print("Введите имя животного, которое удалить: ");
        while (true) {
            String animalName = in.nextLine();
            if (animals.containsKey(animalName)) {
                animals.remove(animalName);
                break;
            } else System.out.println("Некорректный ввод. Повторите операцию.");
        }
    }
}
