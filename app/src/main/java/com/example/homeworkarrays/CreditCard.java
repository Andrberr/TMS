package com.example.homeworkarrays;

import java.util.Scanner;

public class CreditCard {
    int accountNumber;
    int accountMoney;

    public CreditCard(int accountNumber, int accountMoney) {
        this.accountNumber = accountNumber;
        this.accountMoney = accountMoney;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public int getAccountMoney() {
        return this.accountMoney;
    }

    public void addMoney(int moneyToAdd) {
        this.accountMoney += moneyToAdd;
    }

    public void removeMoney(int moneyToRemove) {
        this.accountMoney -= moneyToRemove;
    }

    public void cardStatus() {
        System.out.println("Account Number: " + this.getAccountNumber() + ", Current amount of Money: " + this.getAccountMoney());
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input information about Credit Cards: ");
        System.out.println("Input Account Number and start amount of Money of the first Card: ");
        CreditCard firCard = new CreditCard(in.nextInt(), in.nextInt());
        System.out.println("Input Account Number and start amount of Money of the second Card: ");
        CreditCard secCard = new CreditCard(in.nextInt(), in.nextInt());
        System.out.println("Input Account Number and start amount of Money of the third Card: ");
        CreditCard thirdCard = new CreditCard(in.nextInt(), in.nextInt());
        System.out.println();
        System.out.println("Cards Information:");
        firCard.cardStatus();
        secCard.cardStatus();
        thirdCard.cardStatus();
        System.out.println();

        System.out.print("Input amount of Money to add to the first Card: ");
        firCard.addMoney(in.nextInt());
        System.out.print("Input amount of Money to add to the second Card: ");
        secCard.addMoney(in.nextInt());
        System.out.print("Input amount of Money to remove from the third Card: ");
        thirdCard.removeMoney(in.nextInt());
        System.out.println();
        System.out.println("Cards Information:");
        firCard.cardStatus();
        secCard.cardStatus();
        thirdCard.cardStatus();
    }
}
