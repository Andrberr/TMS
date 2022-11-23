package com.example.homeworkarrays;

public class Dog extends Animal{
    private String breedDog;
    public Dog(String food, String location, String animal, String breedDog){
        super(food,location,animal);
        this.breedDog = breedDog;
    }
    @Override
    void makeNoise(){
        System.out.println("Собака гавкает.");
    }
}
