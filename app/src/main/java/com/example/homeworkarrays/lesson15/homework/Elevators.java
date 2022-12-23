package com.example.homeworkarrays.lesson15.homework;

public class Elevators {
    private final int BIG_ELEVATOR_CAPACITY = 10;
    private final int FAST_ELEVATOR_CAPACITY = 6;
    private int peopleAmount;
    private int peopleAmountFast = 0;
    private int peopleAmountBig = 0;
    private boolean bigIsFull;
    private boolean fastIsFull;
    int moveTime = 1;

    public Elevators(int peopleAmount) {
        this.peopleAmount = peopleAmount;
        this.bigIsFull = false;
        this.fastIsFull = false;
    }

    public int getPeopleAmount() {
        return peopleAmount;
    }

    public int getPeopleAmountFast() {
        return peopleAmountFast;
    }

    public int getPeopleAmountBig() {
        return peopleAmountBig;
    }

    public synchronized void addPeopleToBigElevator() {
        while (!this.fastIsFull || this.bigIsFull) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }

        int currAmount = this.peopleAmount;
        if (currAmount != 0) {
            this.peopleAmount = (currAmount >= BIG_ELEVATOR_CAPACITY) ? currAmount - BIG_ELEVATOR_CAPACITY : 0;
            int uppedPeople = currAmount - this.peopleAmount;
            System.out.println("Большой лифт поднял " + uppedPeople);
            peopleAmountBig += uppedPeople;
        }
        this.bigIsFull = true;
        this.fastIsFull = false;
        notify();
    }

    public synchronized void addPeopleToFastElevator() {
        while (this.fastIsFull) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }

        int currAmount = this.peopleAmount;
        if (currAmount != 0) {
            this.peopleAmount = (currAmount >= FAST_ELEVATOR_CAPACITY) ? currAmount - FAST_ELEVATOR_CAPACITY : 0;
            int uppedPeople = currAmount - this.peopleAmount;
            System.out.println("Скоростной лифт поднял " + uppedPeople);
            peopleAmountFast += uppedPeople;
        }
        if (moveTime == 1) {
            this.fastIsFull = true;
            this.bigIsFull = false;
            moveTime = 2;
        } else {
            this.fastIsFull = false;
            moveTime = 1;
        }
        notify();
    }
}
