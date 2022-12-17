package com.example.homeworkarrays.lesson13.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StreamWork {
    private static List<Integer> numbers = new ArrayList<>();

    public static void main(String[] args) {
        initialize();
        deleteRepeatedElements();
        evenNumbersInRange();
        multiplyNumbers();
        removeNumbers();
        printStreamAmount();
        findAverageNumber();
    }

    public static void initialize() {
        Scanner in = new Scanner(System.in);
        System.out.print("Input amount of numbers: ");
        int amount = in.nextInt();
        for (int i = 1; i <= amount; i++) numbers.add((int) (Math.random() * 20) + 1);
        System.out.println(numbers.toString());
    }

    public static void deleteRepeatedElements() {
        numbers = numbers.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Without duplicates: " + numbers);
    }

    public static void evenNumbersInRange() {
        numbers = numbers.stream()
                .filter(num -> num % 2 == 0 && num >= 7 && num <= 17)
                .collect(Collectors.toList());
        System.out.println("All even numbers from 7 to 17: " + numbers);
    }

    public static void multiplyNumbers() {
        numbers = numbers.stream()
                .map(num -> num * 2)
                .collect(Collectors.toList());
        System.out.println("Multiplied numbers: " + numbers);
    }

    public static void removeNumbers() {
        numbers = numbers.stream()
                .filter(num -> num > 10)
                .collect(Collectors.toList());
        System.out.println("All numbers that are > 10: " + numbers);
    }

    public static void printStreamAmount() {
        System.out.println("Amount of elements int stream = " + numbers.stream().count());
    }

    public static void findAverageNumber() {
        Optional<Integer> averageNumber = numbers.stream()
                .reduce((x, y) -> x + y);
        int result = averageNumber.get() / numbers.size();
        System.out.println("Average value = " + result);
    }
}
