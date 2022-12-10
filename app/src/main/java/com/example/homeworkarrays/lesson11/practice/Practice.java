package com.example.homeworkarrays.lesson11.practice;

import java.util.ArrayList;
import java.util.List;

public class Practice {
    public static void main(String[] args) {
        ArrayList<Student> students= new ArrayList<>();
        students.add(new Student("Andrey", 151001, 8, 2));
        students.add(new Student("Dima", 151001, 2, 3));
        students.add(new Student("Vanya", 151001, 3, 1));
        students.add(new Student("Nikita", 151001, 5, 2));
        upCourse(students);
        printStudents(students, 2);

        ArrayList<Student> bestStudents = new ArrayList<>();
        chooseBestStudents(students, bestStudents);
        printBestStudents(bestStudents);
    }

    public static void chooseBestStudents(List<Student> students, List<Student> bestStudents){
        for (int i=0; i<students.size(); i++){
            if (students.get(i).averageMark >= 3) bestStudents.add(students.get(i));
        }
    }

    public static void printBestStudents(List<Student> bestStudents){
        System.out.println("Студенты со средним баллом >=3: ");
        for (int i=0; i<bestStudents.size(); i++){
            System.out.println(bestStudents.get(i).name);
        }
    }

    public static void upCourse(List<Student> students){
        for (int i=0; i<students.size(); i++){
            if (students.get(i).averageMark >= 3) students.get(i).course++;
        }
    }

    public static void printStudents(List<Student> students, int course){
        for (int i=0; i<students.size(); i++){
            if (students.get(i).course == course) System.out.println(students.get(i).name);
        }
    }
}
