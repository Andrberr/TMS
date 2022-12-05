package com.example.homeworkarrays.lesson10.practice;

import java.util.Scanner;

public class Str {
    public static void main(String[] args) {
        operations();
    }

    public static void checkAlphabet() {
        System.out.print("Введите английский алфавит: ");
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        input = input.trim();
        if (!input.startsWith("a")) System.out.println("Неверное начало.");
        else if (!input.regionMatches(1, "abcdefghijklmnopqrstuvwxyz", 1, 24))
            System.out.println("Неверная середина.");
        else if (!input.endsWith("z")) System.out.println("Неверный конец.");
        else System.out.println("Верно.");
    }

    public static void trainSBuilder() {
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb);
        System.out.println("charAt(1) = " + sb.charAt(1));
        sb.setCharAt(1, 'i');
        sb.setLength(2);
        System.out.println(sb);
    }

    public static void printStringInformation(String str) {
        System.out.println(str.charAt(str.length() - 1));
        System.out.println(str.endsWith("!!!"));
        System.out.println(str.startsWith("I like"));
        System.out.println(str.contains("Java"));
        System.out.println(str.indexOf("Java"));
        System.out.println(str.replace('a', 'o'));
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        str = str.substring(0, str.indexOf("Java")) + str.substring(str.indexOf("Java") + 4);
        System.out.println(str);
    }

    public static StringBuilder createStringB(int a, int b, String operation, int res) {
        StringBuilder str = new StringBuilder();
        str.append(a).append(operation).append(b).append(" = ").append(res);
        System.out.println(str);
        return str;
    }

    public static void replaceEqually(StringBuilder str) {
        int index = str.indexOf("=");
        str.deleteCharAt(index);
        str.insert(index, "равно");
        System.out.println(str);
    }

    public static void replaceOperations(StringBuilder str, String operation, String replaceFor) {
        str.replace(str.indexOf(operation), str.indexOf(operation) + 1, replaceFor);
        System.out.println(str);
    }

    public static void operations() {
        System.out.println("Введите 2 числа :");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        StringBuilder str1 = createStringB(a, b, " + ", a + b);
        StringBuilder str2 = createStringB(a, b, " - ", a - b);
        StringBuilder str3 = createStringB(a, b, " * ", a * b);

        replaceEqually(str1);
        replaceEqually(str2);
        replaceEqually(str3);

        replaceOperations(str1, "+", "плюс");
        replaceOperations(str2, "-", "минус");
        replaceOperations(str3, "*", "умножить");
    }
}
