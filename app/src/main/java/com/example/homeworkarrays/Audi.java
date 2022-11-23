package com.example.homeworkarrays;

public class Audi extends Car {
    String model;

    public Audi(String model, String marka) {
        super(marka);
        this.model = model;
    }

    public static void main(String[] args) {
        Audi car = new Audi("i8", "audi");
        car.print();
    }
}

