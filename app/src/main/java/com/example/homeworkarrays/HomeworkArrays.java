package com.example.homeworkarrays;

import java.util.Arrays;
import java.util.Scanner;

public class HomeworkArrays {
    public static void main(String[] args) {
        deleteNumber();
    }

    public static void deleteNumber() {
        int arraySize = 10;
        int[] array = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            array[i] = (int) (Math.random() * 10);
        }
        System.out.println("Array: " + Arrays.toString(array));

        Scanner in = new Scanner(System.in);
        System.out.print("Input number to delete: ");
        int num = in.nextInt();

        int deleteSize = 0;
        for (int elem : array) {
            if (elem != num) deleteSize++;
        }
        if (deleteSize != array.length) {
            int[] deleteArr = new int[deleteSize];
            int i = 0;
            for (int elem : array) {
                if (elem != num) {
                    deleteArr[i] = elem;
                    i++;
                }
            }
            System.out.println("Array without inputed number: " + Arrays.toString(deleteArr));
        } else System.out.println("There is no inputed number in array.");
    }
}
