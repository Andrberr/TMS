package com.example.homeworkarrays.lesson12.homework;

public class Cat extends Pet {
    private String catFood;

    public Cat(String name, String breed, String catFood) {
        super(name, breed);
        this.catFood = catFood;
    }

    public String getCatFood() {
        return catFood;
    }

    @Override
    public void printInfo() {
        System.out.println("Имя кота: " + this.getName() + ", Порода кота: " + this.getBreed() + ", Еда кота: " + this.getCatFood());
    }
}
