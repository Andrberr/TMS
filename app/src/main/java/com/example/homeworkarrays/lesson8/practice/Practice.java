package com.example.homeworkarrays.lesson8.practice;

public class Practice {
    public static void main(String[] args){
        /*
        Computer comp = new Computer();
        comp.print();
        comp.write();
        Walkable someObj = new Walkable(){
            @Override
            public void walk(){
                System.out.println("Some text.");
            }
        };
        someObj.walk();
         */
        Rectangle rect = new Rectangle(10, 10);
        Triangle tr = new Triangle(10);
        Circle circ = new Circle(10);
        System.out.println(rect.getSquare()+" " + tr.getSquare() + " " + circ.getSquare());
    }
}
