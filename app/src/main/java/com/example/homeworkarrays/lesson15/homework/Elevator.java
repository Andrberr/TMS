package com.example.homeworkarrays.lesson15.homework;

public abstract class Elevator implements Runnable {
    private static int peopleCount;
    int addedPeopleAmount = 0;

    public Elevator(int peopleAmount) {
        peopleCount = peopleAmount;
    }

    public int getPeopleCount() {
        return peopleCount;
    }

    public void setPeopleCount(int peopleAmount) {
        peopleCount = peopleAmount;
    }
}
