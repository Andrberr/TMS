package com.example.homeworkarrays.lesson9.practice;

import java.util.Scanner;

public class Except {

    public static boolean check(String str) {
        boolean correct = true;
        if (str.length() >= 20) correct = false;
        if (correct) {
            for (int i = 0; i < str.length(); i++) {
                char code = str.charAt(i);
                if (!((code >= 65 && code <= 90) || (code >= 97 && code <= 122) || (code >= 48 && code <= 57) || code == 95)) {
                    correct = false;
                    break;
                }
            }
        }
        return correct;
    }

    public static void test(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (!check(login)) throw new WrongLoginException("Wrong login");
        if (!check(password) || !password.equals(confirmPassword))
            throw new WrongPasswordException("Wrong Password");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            System.out.print("Введите Логин: ");
            String login = in.nextLine();
            System.out.print("Введите Пароль: ");
            String password = in.nextLine();
            System.out.print("Введите повторно Пароль: ");
            String confirmPassword = in.nextLine();
            test(login, password, confirmPassword);
        } catch (WrongLoginException e1) {
            System.out.println("Некорректный ввод логина.");
        } catch (WrongPasswordException e2) {
            System.out.println("Некорректный ввод пароля.");
        }
    }
}
