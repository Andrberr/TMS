package com.example.homeworkarrays;

import java.util.Arrays;
import java.util.Scanner;

public class HomeworkArrays {
    public static void main(String[] args) {
        twoArrays();
    }

    public static void twoArrays() {
        Scanner in = new Scanner(System.in);
        int arraySize;
        boolean checkSize = false;
        do {
            System.out.print("Input amount of elements in array: ");
            arraySize = in.nextInt();
            if (arraySize > 5 && arraySize <= 10) checkSize = true;
            else
                System.out.println("Amount of elements doesn't satisfy the condition. Please try again.");
        } while (!checkSize);

        int[] array = new int[arraySize];
        int sizeChet = 0;
        for (int i = 0; i < arraySize; i++) {
            array[i] = (int) (Math.random() * 100);
            if (array[i] % 2 == 0) sizeChet++;
        }
        System.out.println("First array: " + Arrays.toString(array));

        if (sizeChet != 0) {
            int[] arrayChet = new int[sizeChet];
            int i = 0;
            for (int elem : array) {
                if (elem % 2 == 0) {
                    arrayChet[i] = elem;
                    i++;
                }
            }
            System.out.println("Second array: " + Arrays.toString(arrayChet));
        } else System.out.println("There are no even numbers in first array.");
    }
}
