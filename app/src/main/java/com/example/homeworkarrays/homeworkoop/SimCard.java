package com.example.homeworkarrays.homeworkoop;

import java.util.Scanner;

public class SimCard {
    private int balance;
    private String number;
    private int pinCode;
    public boolean simIsBlocked;

    protected SimCard(int balance, String number, int pinCode) {
        this.balance = balance;
        this.number = number;
        this.pinCode = pinCode;
        this.simIsBlocked = false;
    }

    public int getBalance() {
        if (!this.isSimIsBlocked()) return this.balance;
        return 0;
    }

    public void setBalance(int balance) {
        if (!this.isSimIsBlocked()) this.balance = balance;
        else System.out.println("Сим карта заблокирована.");
    }

    public String getNumber() {
        if (!this.isSimIsBlocked()) return this.number;
        System.out.println("Сим карта заблокирована.");
        return null;
    }

    public String getOperatorName() {
        return null;
    }

    public void makeCall(String simNum) {
        if (this.getBalance() <= 0) System.out.println("Звонок запрещён.");
        else System.out.println("Звоню на номер " + this.getNumber() + ".");
    }

    public void receiveCall(String simNum) {
        System.out.println("Принимаю звонок с номера " + this.getNumber() + ".");
    }

    public void printInfo() {
        if (!this.isSimIsBlocked())
            System.out.println("Номер = " + this.getNumber() + ", Оператор = " + this.getOperatorName() + ", Баланс = " + this.getBalance() + ", Пин-Код = " + this.pinCode);
        else System.out.println("Сим карта заблокирована.");
    }

    public boolean isSimIsBlocked() {
        return this.simIsBlocked;
    }

    public void checkPinCode() {
        int kolPinInput = 1;
        int inputCode;
        while (kolPinInput <= 3) {
            System.out.print("Введите пин-код симки. Количество оставшихся попыток = " + (4 - kolPinInput) + ": ");
            inputCode = inputCode();
            if (inputCode == this.pinCode) {
                System.out.println("Пин-код верный. Вы разблокировали сим карту.");
                break;
            } else {
                System.out.println("Пин-код неверный.");
                if (kolPinInput == 3) {
                    this.simIsBlocked = true;
                    System.out.println("Сим карта заблокирована.");
                }
            }
            kolPinInput++;
        }
    }

    public int inputCode() {
        Scanner in = new Scanner(System.in);
        int value = 0;
        String inputString;
        boolean isNum = false;
        do {
            inputString = in.nextLine();
            try {
                value = Integer.parseInt(inputString);
                if (inputString.length() == 4) isNum = true;
                else System.out.println("Некорректный ввод.");
            } catch (NumberFormatException e) {
                System.out.println("Некорректный ввод.");
            }
        } while (!isNum);
        return value;
    }
}
