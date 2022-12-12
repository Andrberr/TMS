package com.example.homeworkarrays.lesson12.practice;

import java.util.HashSet;
import java.util.Scanner;

public class Number {
    private static final String REGEXP = "[0-9]*";

    public static void main(String[] args) {
        DeleteRepeatElements();
    }

    public static void DeleteRepeatElements() {
        Scanner in = new Scanner(System.in);
        HashSet<Integer> nums = new HashSet<>();
        while (true) {
            System.out.print("Введите число: ");
            String number = in.nextLine();
            if (number.equals("!")) break;
            else if (number.matches(REGEXP)) nums.add(Integer.parseInt(number));
        }
        System.out.println(nums);
    }
}
