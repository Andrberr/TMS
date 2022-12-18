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
        operateWithNumbers();
    }

    public static void initialize() {
        Scanner in = new Scanner(System.in);
        System.out.print("Input amount of numbers: ");
        int amount = in.nextInt();
        for (int i = 1; i <= amount; i++) numbers.add((int) (Math.random() * 20) + 1);
        System.out.println(numbers.toString());
    }

    public static void operateWithNumbers() {
        System.out.println("All even numbers from 7 to 17:");
        numbers = numbers.stream()
                .distinct()
                .filter(num -> {
                    if (num % 2 == 0 && num >= 7 && num <= 17) {
                        System.out.print(num + " ");
                    }
                    return true;
                })
                .map(num -> num * 2)
                .filter(num -> num > 10)
                .collect(Collectors.toList());
        System.out.println();
        System.out.println("Double numbers that are > 10: ");
        System.out.println(numbers.toString());
        long count = numbers.stream().count();
        System.out.println("Amount of numbers = " + count);
        System.out.println("Average value = " + numbers.stream().reduce((x, y) -> x + y).get() / count);
    }
}