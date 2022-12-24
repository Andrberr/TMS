package com.example.homeworkarrays.lesson15.homework;

public abstract class Elevator implements Runnable {
    private static int peopleCount;
    int capacity;
    int addedPeopleAmount = 0;

    public Elevator(int peopleAmount, int capacity) {
        peopleCount = peopleAmount;
        this.capacity = capacity;
    }

    public int getPeopleCount() {
        return peopleCount;
    }

    public void setPeopleCount(int peopleAmount) {
        peopleCount = peopleAmount;
    }
}
