package com.example.homeworkarrays.lesson15.homework;

public class FastElevator extends Elevator {
    private final Elevators fastElevator;

    public FastElevator(Elevators fastElevator) {
        this.fastElevator = fastElevator;
    }

    @Override
    public void run() {
        while (this.fastElevator.getPeopleAmount() > 0) {
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){}
            this.fastElevator.addPeopleToFastElevator();
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){}
        }
        System.out.println("Скоростной лифт поднял всего " + fastElevator.getPeopleAmountFast());
    }
}
