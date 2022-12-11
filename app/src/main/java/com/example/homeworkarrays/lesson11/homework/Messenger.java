package com.example.homeworkarrays.lesson11.homework;

import java.util.ArrayList;
import java.util.Scanner;

public class Messenger {
    private static ArrayList<User> users = new ArrayList<User>();
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        programMenu();
    }

    public static int inputOperation() {
        boolean correctInput = false;
        int numOperation = 0;
        do {
            String operation = in.nextLine();
            try {
                numOperation = Integer.parseInt(operation);
                if (numOperation > 0 && numOperation <= 5) correctInput = true;
            } catch (NumberFormatException e) {
            } finally {
                if (!correctInput) System.out.println("Некорректный ввод. Повторите попытку.");
            }
        } while (!correctInput);
        return numOperation;
    }

    public static void addUser() {
        System.out.println("Введите имя нового пользователя:");
        String userName = in.nextLine();
        for (User user : users) {
            if (user.getUserName().equals(userName)) {
                System.out.println("Уже есть такой пользователь.");
                return;
            }
        }
        users.add(new User(userName));
        System.out.println("Пользователь добавлен.");
    }

    public static void readWriteMessages(int neededOperation) {
        if (neededOperation == 1)
            System.out.println("Введите имя пользователя, которому хотите написать:");
        else System.out.println("Введите имя пользователя, сообщения которого хотите прочитать:");
        String userName = in.nextLine();
        boolean userExists = false;
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getUserName().equals(userName)) {
                userExists = true;
                if (neededOperation == 1) {
                    System.out.println("Введите сообщение, которое хотите написать:");
                    users.get(i).writeMessages(in.nextLine());
                } else users.get(i).readMessages();
                break;
            }
        }
        if (!userExists) System.out.println("Нет такого пользователя.");
    }

    public static void printUsers() {
        System.out.println("Список существующих пользователей:");
        for (User user : users) {
            System.out.println(user.getUserName());
        }
    }

    public static void programMenu() {

        boolean isFinished = false;
        do {
            System.out.println();
            System.out.println("Введите 1, чтобы добавить пользователя.");
            System.out.println("Введите 2, чтобы написать сообщения пользователю.");
            System.out.println("Введите 3, чтобы прочитать сообщения пользователя.");
            System.out.println("Введите 4, чтобы посмотреть список существующих пользователей.");
            System.out.println("Введите 5, чтобы закончить программу.");
            int operation = inputOperation();
            switch (operation) {
                case 1: {
                    addUser();
                    break;
                }
                case 2: {
                    if (!users.isEmpty()) readWriteMessages(1);
                    else System.out.println("Сначала добавьте пользователей.");
                    break;
                }
                case 3: {
                    if (!users.isEmpty()) readWriteMessages(2);
                    else System.out.println("Сначала добавьте пользователей.");
                    break;
                }
                case 4: {
                    printUsers();
                    break;
                }
                case 5: {
                    isFinished = true;
                    System.out.println("Программа завершена.");
                    break;
                }
            }
        } while (!isFinished);
    }
}
