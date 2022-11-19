package com.example.homeworkarrays;

import java.util.Arrays;
import java.util.Scanner;

public class MultiArrays {
    public static void main(String[] args) {
        task1();
    }

    public static void task1() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размеры двумерного массива:");
        int stringSize = in.nextInt();
        int columnSize = in.nextInt();
        int[][] twoMerArray = new int[stringSize][columnSize];
        for (int i = 0; i < twoMerArray.length; i++) {
            for (int j = 0; j < twoMerArray[i].length; j++) {
                twoMerArray[i][j] = (int) (Math.random() * 10);
            }
        }
        System.out.println("Двумерный массив: " + Arrays.deepToString(twoMerArray));

        int oneMerArraySize = stringSize * columnSize;
        int[] oneMerArray = new int[oneMerArraySize];
        int oneMerArrayInd = 0;
        for (int[] array : twoMerArray) {
            for (int elem : array) {
                oneMerArray[oneMerArrayInd++] = elem;
            }
        }
        System.out.println("Одномерный массив: " + Arrays.toString(oneMerArray));
    }
}
