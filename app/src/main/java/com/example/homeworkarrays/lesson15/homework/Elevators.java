package com.example.homeworkarrays.lesson15.homework;

public class Elevators {
    private final int BIG_ELEVATOR_CAPACITY = 10;
    private final int FAST_ELEVATOR_CAPACITY = 6;
    private int peopleAmount;
    private int peopleAmountFast = 0;
    private int peopleAmountBig = 0;

    public Elevators(int peopleAmount) {
        this.peopleAmount = peopleAmount;
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
        int currAmount = this.peopleAmount;
        if (currAmount != 0) {
            this.peopleAmount = (currAmount >= BIG_ELEVATOR_CAPACITY) ? currAmount - BIG_ELEVATOR_CAPACITY : 0;
            int uppedPeople = currAmount - this.peopleAmount;
            System.out.println("Большой лифт поднял " + uppedPeople);
            peopleAmountBig += uppedPeople;
        }
    }

    public synchronized void addPeopleToFastElevator() {
        int currAmount = this.peopleAmount;
        if (currAmount != 0) {
            this.peopleAmount = (currAmount >= FAST_ELEVATOR_CAPACITY) ? currAmount - FAST_ELEVATOR_CAPACITY : 0;
            int uppedPeople = currAmount - this.peopleAmount;
            System.out.println("Скоростной лифт поднял " + uppedPeople);
            peopleAmountFast += uppedPeople;
        }
    }
}
