package com.example.homeworkarrays;

import java.util.Arrays;
import java.util.Scanner;

public class Person {
    String fullName;
    int age;

    public Person(){

    }
    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void move(){
        System.out.println(fullName + " говорит.");
    }

    public void talk(){
        System.out.println(fullName + " говорит.");
    }

    public static void main(String[] args) {
      Person pers1 = new Person();
      Person pers2 = new Person("Andrey", 18);
        pers1.move();
        pers2.talk();
    }
}

