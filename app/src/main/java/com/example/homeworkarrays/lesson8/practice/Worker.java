package com.example.homeworkarrays.lesson8.practice;

public abstract class Worker extends Person {
    private int experience;
    public Worker(String name, int age, int experience){
        super(name, age);
        this.experience = experience;
    }

    abstract String getSpecialization();

    int getExperience(){
        return this.experience;
    }
}
