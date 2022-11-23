package com.example.homeworkarrays;

public class PracticeSt {
    public static void main(String[] args){
        Student[] students = new Student[2];
        students[0] = new Student("Andrey", "Berezkin", 151001, 8.6);
        students[1] = new Aspirant("Ivan", "Ivanov", 151343, 5, "Aspirant Science");
        for (Student student:students){
            System.out.println(student.getScholarShip());
        }
    }
}
