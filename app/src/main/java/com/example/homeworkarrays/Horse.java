package com.example.homeworkarrays;

public class Horse extends Animal{
    private String breedHorse;
    public Horse(String food, String location, String animal, String breedHorse){
        super(food,location,animal);
        this.breedHorse = breedHorse;
    }
    @Override
    void makeNoise(){
        System.out.println("Лошадь издаёт звук.");
    }
}
