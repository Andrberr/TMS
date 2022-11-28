package com.example.homeworkarrays.lesson8.practice;

public class Circle extends Figure{
    public Circle(int side){
        super(side);
    }
    @Override
    public int getSquare(){
        return (int)(Math.PI*getSide()*getSide());
    }
}
