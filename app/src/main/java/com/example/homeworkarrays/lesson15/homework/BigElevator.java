package com.example.homeworkarrays.lesson15.homework;

public class BigElevator extends Elevator {
    private static final int BIG_ELEVATOR_CAPACITY = 10;

    public BigElevator(int peopleCount) {
        super(peopleCount);
    }

    @Override
    public void run() {
        while (super.getPeopleCount() > 0) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
            }
            addPeopleToBigElevator(super.getPeopleCount());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
            }
        }
        System.out.println("Большой лифт поднял всего " + addedPeopleAmount);
    }

    public synchronized void addPeopleToBigElevator(int peopleAmount) {
        int currAmount = peopleAmount;
        if (currAmount != 0) {
            peopleAmount = (currAmount >= BIG_ELEVATOR_CAPACITY) ? currAmount - BIG_ELEVATOR_CAPACITY : 0;
            super.setPeopleCount(peopleAmount);
            int uppedPeople = currAmount - peopleAmount;
            System.out.println("Большой лифт поднял " + uppedPeople);
            addedPeopleAmount += uppedPeople;
        }
    }
}
