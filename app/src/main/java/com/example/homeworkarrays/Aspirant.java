package com.example.homeworkarrays;

public class Aspirant extends Student{
    String scienceWork;

    public Aspirant(String firstName, String lastName, int group, double averageMark, String scienceWork){
        super(firstName, lastName, group, averageMark);
        this.scienceWork = scienceWork;
    }
    @Override
    int getScholarShip(){
        if (this.getAverageMark() == 5) return 200;
        return 180;
    }
}
