package com.example.homeworkarrays.lesson15.homework;

public class BigElevator implements Runnable {
    private final Elevators bigElevator;

    public BigElevator(Elevators bigElevator) {
        this.bigElevator = bigElevator;
    }

    @Override
    public void run() {
        while (this.bigElevator.getPeopleAmount() > 0) {
            this.bigElevator.addPeopleToBigElevator();
        }
        System.out.println("Большой лифт поднял всего " + bigElevator.getPeopleAmountBig());
    }
}
