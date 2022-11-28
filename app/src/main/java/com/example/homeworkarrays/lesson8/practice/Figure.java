package com.example.homeworkarrays.lesson8.practice;

public abstract class Figure implements Squarable{
    private int side;
    public Figure(int side){
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }
}
