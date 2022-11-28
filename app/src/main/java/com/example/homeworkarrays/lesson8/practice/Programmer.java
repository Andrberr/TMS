package com.example.homeworkarrays.lesson8.practice;

public class Programmer extends Worker{
    public Programmer(String name, int age, int exprience){
        super(name, age, exprience);
    }
    @Override
    String getSpecialization(){
        return "Programmer";
    }
}
