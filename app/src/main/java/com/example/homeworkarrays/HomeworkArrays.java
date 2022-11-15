package com.example.homeworkarrays;

import java.util.Arrays;

public class HomeworkArrays {
    public static void main(String[] args) {
        nameArray();
    }

    public static void nameArray() {
        String[] array = {"Dana", "Andrey", "Nikita", "Dima", "Vlad", "Dasha"};
        System.out.println("Unsorted array: " + Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("Sorted array: " + Arrays.toString(array));
    }
}
