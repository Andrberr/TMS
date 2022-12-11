package com.example.homeworkarrays.lesson11.homework;

import java.util.ArrayList;
import java.util.Scanner;

public class Messenger {
    private static ArrayList<User> users = new ArrayList<User>();
    private static Scanner in = new Scanner(System.in);
    private static final int ADD_OPERATION = 1;
    private static final int WRITE_OPERATION = 2;
    private static final int READ_OPERATION = 3;
    private static final int PRINT_OPERATION = 4;
    private static final int END_OPERATION = 5;
    public static void main(String[] args) {
        programMenu();
    }

    public static int inputOperation() {
        int numOperation;
        while(true){
            String operation = in.nextLine();
            try {
                numOperation = Integer.parseInt(operation);
                if (numOperation > 0 && numOperation <= 5) break;
                System.out.println("Некорректный ввод. Повторите попытку.");
            } catch (NumberFormatException e) {
                System.out.println("Некорректный ввод. Повторите попытку.");
            }
        }
        return numOperation;
    }

    public static void addUser() {
        System.out.println("Введите имя нового пользователя:");
        String userName = in.nextLine();
        User newUser = new User(userName);
        if (users.contains(newUser)) System.out.println("Уже есть такой пользователь.");
        else{
            users.add(newUser);
            System.out.println("Пользователь добавлен.");
        }
    }

    public static void readWriteMessages(int neededOperation) {
        if (neededOperation == 1)
            System.out.println("Введите имя пользователя, которому хотите написать:");
        else System.out.println("Введите имя пользователя, сообщения которого хотите прочитать:");
        String userName = in.nextLine();
        User existsUser = new User(userName);
        if (users.contains(existsUser)) {
            if (neededOperation == 1) {
                System.out.println("Введите сообщение, которое хотите написать:");
                users.get(users.indexOf(existsUser)).writeMessages(in.nextLine());
            } else users.get(users.indexOf(existsUser)).readMessages();
        }
    }

    public static void printUsers() {
        System.out.println("Список существующих пользователей:");
        for (User user : users) {
            System.out.println(user.getUserName());
        }
    }

    public static void programMenu() {
        menu:
        {
            while (true) {
                System.out.println();
                System.out.println("Введите 1, чтобы добавить пользователя.");
                System.out.println("Введите 2, чтобы написать сообщения пользователю.");
                System.out.println("Введите 3, чтобы прочитать сообщения пользователя.");
                System.out.println("Введите 4, чтобы посмотреть список существующих пользователей.");
                System.out.println("Введите 5, чтобы закончить программу.");
                int operation = inputOperation();
                switch (operation) {
                    case ADD_OPERATION: {
                        addUser();
                        break;
                    }
                    case WRITE_OPERATION: {
                        if (!users.isEmpty()) readWriteMessages(1);
                        else System.out.println("Сначала добавьте пользователей.");
                        break;
                    }
                    case READ_OPERATION: {
                        if (!users.isEmpty()) readWriteMessages(2);
                        else System.out.println("Сначала добавьте пользователей.");
                        break;
                    }
                    case PRINT_OPERATION: {
                        printUsers();
                        break;
                    }
                    case END_OPERATION: {
                        System.out.println("Программа завершена.");
                        break menu;
                    }
                }
            }
        }
    }
}
