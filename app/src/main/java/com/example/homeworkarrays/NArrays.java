package com.example.homeworkarrays;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class NArrays {
    static Scanner in = new Scanner(System.in);
    static int iPoint=0, jPoint=0;
    public static void main(String[] args) {
        crossZero();
    }

    public static void outputArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 1) System.out.print("X ");
                else if (arr[i][j] == 2) System.out.print("O ");
                else if (arr[i][j] == 0) System.out.print("- ");
            }
            System.out.println();
        }
    }

    public static boolean gameLogic(int[][] field, int iPoint, int jPoint) {
        boolean fullLine = true;
        for (int j = 0; j < field[iPoint].length; j++) {
            if (field[iPoint][j] != field[iPoint][jPoint]) {
                fullLine = false;
                break;
            }
        }

        if (fullLine) return fullLine;
        else {
            fullLine = true;
            for (int i = 0; i < field.length; i++) {
                if (field[i][jPoint] != field[iPoint][jPoint]) {
                    fullLine = false;
                    break;
                }
            }

            if (fullLine) return fullLine;
            else {
                if (iPoint == jPoint) {
                    fullLine = true;
                    for (int i = 0; i < field.length; i++) {
                        if (field[i][i] != field[iPoint][jPoint]) {
                            fullLine = false;
                            break;
                        }
                    }
                    if (fullLine) return fullLine;
                } else if (jPoint == field[0].length - iPoint - 1) {
                    fullLine = true;
                    for (int i = 0; i < field.length; i++) {
                        if (field[i][field[0].length - i - 1] != field[iPoint][jPoint]) {
                            fullLine = false;
                            break;
                        }
                    }
                    if (fullLine) return fullLine;
                } else return false;
            }
        }
        return false;
    }


    public static int correctSymbol() {
        boolean check = false;
        String input;
        do {
            input = in.next();
            if (!input.equals("1") && !input.equals("2")){
                System.out.println("Некорректный ввод. Повторите попытку:");
            } else check = true;

        } while (!check);

        return Integer.parseInt(input);
    }

    public static void correctIndex(int[][] field){
        boolean correct = false;
        String inputI, inputJ;
        do {
            inputI = in.next();
            inputJ = in.next();
            for (int i=0; i<field.length; i++){
                if (inputI.equals(Integer.toString(i))) {
                    correct = true;
                    iPoint = i;
                    break;
                }
            }

            if (!correct) System.out.println("Некорректный ввод. Повторите попытку: ");
            else{
                correct = false;
                for (int j=0; j<field[0].length; j++){
                    if (inputJ.equals(Integer.toString(j))) {
                        correct = true;
                        jPoint = j;
                        break;
                    }
                }
                if (!correct) System.out.println("Некорректный ввод. Повторите попытку: ");
            }

        } while (!correct);
    }

    public static boolean choosePoint(int[][] field, int player){
        int symbol;
        System.out.println("Введите 1 для крестка, 2 для нолика: ");
        symbol = correctSymbol();
        if (symbol == 1) field[iPoint][jPoint] = 1;
        else field[iPoint][jPoint] = 2;
        if (gameLogic(field, iPoint, jPoint)) {
            System.out.println(player + " player wins!");
            outputArr(field);
            return false;
        }
        return true;
    }

    public static void crossZero() {

        int[][] field = new int[3][3];
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                field[i][j] = 0;
            }
        }

        int player = 1;
        boolean process = true;
        do {
            outputArr(field);
            System.out.println("Ход игрока " + player + ":");
            System.out.print("Введите координаты клетки, куда поставить крестик или нолик: ");
            correctIndex(field);


            if (field[iPoint][jPoint] == 0) {
             process = choosePoint(field,player);
            } else {
                do {
                    System.out.println("Эта клетка уже занята.");
                    System.out.print("Введите координаты клетки, куда поставить крестик или нолик: ");
                    correctIndex(field);
                } while (field[iPoint][jPoint] != 0);
                process = choosePoint(field,player);
            }
            if (player == 1) player = 2;
            else player = 1;

            boolean fullField = true;
            for (int i = 0; i < field.length; i++) {
                for (int j = 0; j < field[i].length; j++) {
                    if (field[i][j] == 0) {
                        fullField = false;
                        break;
                    }
                }
            }
            if (fullField) {
                System.out.println("Game over. The field is full.");
                outputArr(field);
                process = false;
            }

        } while (process);
    }


    public static void task1() {
        Scanner in = new Scanner(System.in);
        System.out.print("Input first size: ");
        int firstSize = in.nextInt();
        System.out.print("Input second size: ");
        int secSize = in.nextInt();
        System.out.print("Input third size: ");
        int thirdSize = in.nextInt();
        int[][][] array = new int[firstSize][secSize][thirdSize];
        for (int i = 0; i < firstSize; i++) {
            for (int j = 0; j < secSize; j++) {
                for (int k = 0; k < thirdSize; k++) {
                    array[i][j][k] = (int) (Math.random() * 10);
                }
            }
        }
        System.out.println(Arrays.deepToString(array));
    }

    public static void task2() {
        char[][] array = new char[8][8];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i % 2 == 0) {
                    if (j % 2 == 0) array[i][j] = 'W';
                    else array[i][j] = 'B';
                } else {
                    if (j % 2 == 0) array[i][j] = 'B';
                    else array[i][j] = 'W';
                }
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }


}
