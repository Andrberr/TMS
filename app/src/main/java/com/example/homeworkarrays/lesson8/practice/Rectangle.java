package com.example.homeworkarrays.lesson8.practice;

public class Rectangle extends Triangle{
    private int anotherSide;
    public Rectangle(int side, int anotherSide){
        super(side);
        this.anotherSide = anotherSide;
    }
    @Override
    public int getSquare(){
        return (int)(getSide()*this.anotherSide);
    }
}
