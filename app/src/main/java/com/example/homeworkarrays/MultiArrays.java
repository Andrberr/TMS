package com.example.homeworkarrays;

import java.util.Arrays;
import java.util.Scanner;

public class MultiArrays {
    public static void main(String[] args) {
        task1();
        task2();
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

    public static void task2() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размеры трёхмерного массива:");
        int tableSize = in.nextInt();
        int stringSize = in.nextInt();
        int columnSize = in.nextInt();
        int[][][] numArray = new int[tableSize][stringSize][columnSize];
        String[][][] stringArray = new String[tableSize][stringSize][columnSize];

        for (int i = 0; i < numArray.length; i++) {
            for (int j = 0; j < numArray[i].length; j++) {
                for (int k = 0; k < numArray[i][j].length; k++) {
                    numArray[i][j][k] = (int) (1 + Math.random() * 10);
                    switch (numArray[i][j][k]) {
                        case 1:
                            stringArray[i][j][k] = "one";
                            break;
                        case 2:
                            stringArray[i][j][k] = "two";
                            break;
                        case 3:
                            stringArray[i][j][k] = "three";
                            break;
                        case 4:
                            stringArray[i][j][k] = "four";
                            break;
                        case 5:
                            stringArray[i][j][k] = "five";
                            break;
                        case 6:
                            stringArray[i][j][k] = "six";
                            break;
                        case 7:
                            stringArray[i][j][k] = "seven";
                            break;
                        case 8:
                            stringArray[i][j][k] = "eight";
                            break;
                        case 9:
                            stringArray[i][j][k] = "nine";
                            break;
                        case 10:
                            stringArray[i][j][k] = "ten";
                            break;
                    }
                }
            }
        }
        System.out.println("Массив чисел: " + Arrays.deepToString(numArray));
        System.out.println("Массив строк: " + Arrays.deepToString(stringArray));
    }
}
