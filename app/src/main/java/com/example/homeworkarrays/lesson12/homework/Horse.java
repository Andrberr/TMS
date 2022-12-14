package com.example.homeworkarrays.lesson12.homework;

public class Horse extends Pet {
    private String horseFood;

    public Horse(String name, String breed, String horseFood) {
        super(name, breed);
        this.horseFood = horseFood;
    }

    public String getHorseFood() {
        return horseFood;
    }

    @Override
    public void printInfo() {
        System.out.println("Имя лошади: " + this.getName() + ", Порода лошади: " + this.getBreed() + ", Еда лошади: " + this.getHorseFood());
    }
}
