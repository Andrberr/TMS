package com.example.homeworkarrays.lesson15.homework;

public class FastElevator extends Elevator {

    public FastElevator(int peopleCount, int capacity) {
        super(peopleCount, capacity);
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
            peopleAmount = (currAmount >= capacity) ? currAmount - capacity : 0;
            super.setPeopleCount(peopleAmount);
            int uppedPeople = currAmount - peopleAmount;
            System.out.println("Скоростной лифт поднял " + uppedPeople);
            addedPeopleAmount += uppedPeople;
        }
    }
}
