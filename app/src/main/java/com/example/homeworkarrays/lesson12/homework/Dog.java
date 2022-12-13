package com.example.homeworkarrays.lesson12.homework;

public class Dog extends Pet {
    private String dogFood;

    public Dog(String name, String breed, String dogFood) {
        super(name, breed);
        this.dogFood = dogFood;
    }

    public String getDogFood() {
        return dogFood;
    }

    @Override
    public void printInfo() {
        System.out.println("Имя собаки: " + this.getName() + ", Порода собаки: " + this.getBreed() + ", Еда собаки: " + this.getDogFood());
    }
}
