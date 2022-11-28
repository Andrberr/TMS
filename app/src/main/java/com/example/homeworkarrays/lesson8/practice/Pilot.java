package com.example.homeworkarrays.lesson8.practice;

public class Pilot extends Worker{
    public Pilot(String name, int age, int exprience){
        super(name, age, exprience);
    }
    @Override
    String getSpecialization(){
        return "Pilot";
    }
}
