package com.example.homeworkarrays.lesson8.practice;

public class Doctor extends Worker{
    public Doctor(String name, int age, int exprience){
        super(name, age, exprience);
    }
    @Override
    String getSpecialization(){
        return "Doctor";
    }
}
