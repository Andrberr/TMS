package com.example.homeworkarrays.lesson15.homework;

public class FastElevator implements Runnable {
    private final Elevators fastElevator;

    public FastElevator(Elevators fastElevator) {
        this.fastElevator = fastElevator;
    }

    @Override
    public void run() {
        while (this.fastElevator.getPeopleAmount() > 0) {
            this.fastElevator.addPeopleToFastElevator();
        }
        System.out.println("Скоростной лифт поднял всего " + fastElevator.getPeopleAmountFast());
    }
}
