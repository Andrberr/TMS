package com.example.homeworkarrays.lesson15.homework;

public class FastElevator extends Elevator {
    private static final int FAST_ELEVATOR_CAPACITY = 6;

    public FastElevator(int peopleCount) {
        super(peopleCount);
    }

    @Override
    public void run() {
        while (super.getPeopleCount() > 0) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            addPeopleToFastElevator(super.getPeopleCount());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
        System.out.println("Скоростной лифт поднял всего " + addedPeopleAmount);
    }

    public synchronized void addPeopleToFastElevator(int peopleAmount) {
        int currAmount = peopleAmount;
        if (currAmount != 0) {
            peopleAmount = (currAmount >= FAST_ELEVATOR_CAPACITY) ? currAmount - FAST_ELEVATOR_CAPACITY : 0;
            super.setPeopleCount(peopleAmount);
            int uppedPeople = currAmount - peopleAmount;
            System.out.println("Скоростной лифт поднял " + uppedPeople);
            addedPeopleAmount += uppedPeople;
        }
    }
}
