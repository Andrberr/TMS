package com.example.homeworkarrays.lesson15.homework;

public class BigElevator extends Elevator{
    private final Elevators bigElevator;

    public BigElevator(Elevators bigElevator) {
        this.bigElevator = bigElevator;
    }

    @Override
    public void run() {
        while (this.bigElevator.getPeopleAmount() > 0) {
            try{
                Thread.sleep(2000);
            }catch(InterruptedException e){}
            this.bigElevator.addPeopleToBigElevator();
            try{
                Thread.sleep(2000);
            }catch(InterruptedException e){}
        }
        System.out.println("Большой лифт поднял всего " + bigElevator.getPeopleAmountBig());
    }
}
