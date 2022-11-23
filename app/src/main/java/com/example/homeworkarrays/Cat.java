package com.example.homeworkarrays;

public class Cat extends Animal{
    private String breedCat;
    public Cat(String food, String location, String animal, String breedCat){
        super(food,location,animal);
        this.breedCat = breedCat;
    }
    @Override
    void makeNoise(){
        System.out.println("Кот мяукает.");
    }
}
