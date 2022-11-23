package com.example.homeworkarrays;

public class Practice {
    public static void main(String[] args){
        Animal[] animals = new Animal[3];
        animals[0] = new Dog("мясо", "дом", "собака", "овчарка");
        animals[1] = new Cat("рыба", "улица", "кот", "домашний");
        animals[2] = new Horse("овёс", "конюшня", "лошадь", ",цыганская");
        Vet vet = new Vet();
        for (int i=0; i<animals.length; i++){
             vet.treatAnimal(animals[i]);
        }
    }
}