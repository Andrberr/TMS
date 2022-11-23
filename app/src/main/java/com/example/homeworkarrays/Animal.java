package com.example.homeworkarrays;

public class Animal {
    private String food;
    private String location;
    private String animal;
    public Animal(String food, String location, String animal){
        this.food = food;
        this.location = location;
        this.animal = animal;
    }

    void makeNoise(){
    }

    void eat(){
        System.out.println(this.animal +" ест.");
    }

    void sleep(){
        System.out.println(this.animal +" спит.");
    }

    public String getFood() {
        return food;
    }

    public String getLocation() {
        return location;
    }

    public String getAnimal() {
        return animal;
    }
}
