package com.example.homeworkarrays.lesson8.practice;

public class Triangle extends Figure{
    public Triangle(int side){
        super(side);
    }
    @Override
    public int getSquare(){
        return (int)(getSide()*getSide()*(Math.sqrt(3))/4);
    }
}
