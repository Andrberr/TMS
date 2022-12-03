package com.example.homeworkarrays.lesson9.practice;

import java.util.Scanner;

public class Except {
    static final int UP_CASE_BEGIN = 65, UP_CASE_END = 90, LOW_CASE_BEGIN = 97, LOW_CASE_END = 122, NUM_BEGIN = 48, NUM_END = 57, UNDER_LINE = 95;

    public static boolean checkForCorrect(String str) {
        boolean correct = true;
        if (str.length() >= 20) correct = false;
        if (correct) {
            for (int i = 0; i < str.length(); i++) {
                char code = str.charAt(i);
                if (!((code >= UP_CASE_BEGIN && code <= UP_CASE_END) || (code >= LOW_CASE_BEGIN && code <= LOW_CASE_END) || (code >= NUM_BEGIN && code <= NUM_END) || code == UNDER_LINE)) {
                    correct = false;
                    break;
                }
            }
        }
        return correct;
    }

    public static void checkInput(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (!checkForCorrect(login)) throw new WrongLoginException("Wrong login");
        if (!checkForCorrect(password) || !password.equals(confirmPassword))
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
            checkInput(login, password, confirmPassword);
        } catch (WrongLoginException | WrongPasswordException e) {
            e.printStackTrace();
        }
    }
}
