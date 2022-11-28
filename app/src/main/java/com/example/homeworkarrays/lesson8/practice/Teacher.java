package com.example.homeworkarrays.lesson8.practice;

public class Teacher extends Worker{
    public Teacher(String name, int age, int exprience){
        super(name, age, exprience);
    }
    @Override
    String getSpecialization(){
        return "Teacher";
    }
}
