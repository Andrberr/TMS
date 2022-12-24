package com.example.homeworkarrays.lesson15.homework;

public class BigElevator extends Elevator {

    public BigElevator(int peopleCount, int capacity) {
        super(peopleCount, capacity);
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
            peopleAmount = (currAmount >= capacity) ? currAmount - capacity : 0;
            super.setPeopleCount(peopleAmount);
            int uppedPeople = currAmount - peopleAmount;
            System.out.println("Большой лифт поднял " + uppedPeople);
            addedPeopleAmount += uppedPeople;
        }
    }
}
