package com.example.homeworkarrays.homeworkoop;

import java.util.Scanner;

public class Practice {
    static Scanner in = new Scanner(System.in);

    public static SimCard randomSim() {
        int operator = (int) (1 + Math.random() * 3);
        int balance = (int) (1 + Math.random() * 10);
        int number = (int) (1000000 + Math.random() * 9000000);
        int pinCode = (int) (1000 + Math.random() * 9000);
        if (operator == 1) return new MtsSimCard(balance, number, pinCode);
        else if (operator == 2) return new A1SimCard(balance, number, pinCode);
        else return new LifeSimCard(balance, number, pinCode);
    }

    public static void printSims(SimCard[] sims) {
        System.out.println("Список Симок:");
        for (SimCard sim : sims) {
            sim.printInfo();
        }
    }

    public static boolean checkValue(String value) {
        if (in.nextLine().equals(value)) return true;
        return false;
    }

    public static int inputMoney() {
        int value = 0;
        String inputString;
        boolean isNum = false;
        do {
            inputString = in.nextLine();
            try {
                value = Integer.parseInt(inputString);
                isNum = true;
            } catch (NumberFormatException e) {
                System.out.println("Некорректный ввод.");
            }
        } while (!isNum);
        return value;
    }

    public static String inputNumber() {
        String inputString;
        int value;
        boolean isCorrect = false;
        do {
            inputString = in.nextLine();
            try {
                value = Integer.parseInt(inputString);
                if ((inputString.startsWith("29") || inputString.startsWith("33") || inputString.startsWith("44")) && (inputString.length() == 9))
                    isCorrect = true;
                else System.out.println("Некорректный ввод.");
            } catch (NumberFormatException e) {
                System.out.println("Некорректный ввод.");
            }
        } while (!isCorrect);
        return inputString;
    }

    public static void main(String[] args) {
        Phone phone = new Phone(null);
        do {
            System.out.print("Введите 1, чтобы включить телефон: ");
        } while (!checkValue("1"));
        phone.turnOn();
        System.out.println();

        int arraySize = (int) (1 + Math.random() * 10);
        SimCard[] simCards = new SimCard[arraySize];
        for (int i = 0; i < simCards.length; i++) {
            simCards[i] = randomSim();
        }

        String field;
        do {
            System.out.println("Введите 1, чтобы включить телефон.");
            System.out.println("Введите 2, чтобы выключить телефон.");
            System.out.println("Введите 3, чтобы вставить симку.");
            System.out.println("Введите 4, чтобы вывести информацию о симке.");
            System.out.println("Введите 5, чтобы вывести информацию о доступных симках.");
            System.out.println("Введите 6, чтобы совершить звонок.");
            System.out.println("Введите 7, чтобы принять звонок.");
            System.out.println("Введите 8, чтобы положить деньги на баланс.");
            System.out.println("Введите 9, чтобы завершить выполнение программы.");
            field = in.nextLine();
            switch (field) {
                case "1": {
                    if (!phone.isPhoneStatus()) {
                        phone.turnOn();
                        if (phone.getSim() != null) phone.getSim().checkPinCode();
                    }
                    else System.out.println("Телефон уже включён.");
                    break;
                }
                case "2": {
                    if (phone.isPhoneStatus()) phone.turnOff();
                    else System.out.println("Телефон уже выключен.");
                    break;
                }
                case "3": {
                    System.out.print("Введите Номер новой симки: ");
                    String number = in.nextLine();
                    boolean simFind = false;
                    for (SimCard sim : simCards) {
                        if (!sim.equals(phone.getSim())) {
                            if (sim.getNumber().equals(number)) {
                                phone.insertNewSim(sim);
                                simFind = true;
                                break;
                            }
                        }
                    }
                    if (!simFind) System.out.println("Нет симки с таким номером.");
                    break;
                }
                case "4": {
                    if (phone.getSim() != null) phone.getSim().printInfo();
                    else System.out.println("В телефоне нет симки.");
                    break;
                }
                case "5": {
                    printSims(simCards);
                    break;
                }
                case "6":
                case "7":
                case "8": {
                    if (!phone.isPhoneStatus())
                        System.out.println("Телефон выключен.");
                    else if (phone.getSim() == null) System.out.println("В телефоне нет симки.");
                    else if (!phone.getSim().isSimIsBlocked()) {
                        if (field.equals("6")) {
                            System.out.print("Введите номер симки, на которую хотите позвонить: ");
                            phone.makeCall(inputNumber());
                        } else if (field.equals("7")) {
                            System.out.print("Введите номер симки, с которой хотите принять звонок: ");
                            phone.receiveCall(inputNumber());
                        } else {
                            System.out.print("Введите сумму, которую хотите положить на баланс: ");
                            phone.getSim().setBalance(inputMoney() + phone.getSim().getBalance());
                        }
                        phone.printBalance();
                    } else System.out.println("Сим карта заблокирована.");
                    break;
                }
            }
            System.out.println();

        } while (!field.equals("9"));
    }
}
