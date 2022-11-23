package com.example.homeworkarrays;

public class Student {
    private String firstName;
    private String lastName;
    private int group;
    private double averageMark;

    public Student(String firstName, String lastName, int group, double averageMark){
        this.averageMark = averageMark;
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getGroup() {
        return group;
    }

    public double getAverageMark() {
        return averageMark;
    }

    int getScholarShip(){
        if (this.getAverageMark() == 5) return 100;
        return 80;
    }
}
