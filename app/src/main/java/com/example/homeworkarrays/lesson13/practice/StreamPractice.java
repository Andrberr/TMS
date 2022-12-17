package com.example.homeworkarrays.lesson13.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamPractice {
    public static void main(String[] args) {
     findChetNums();
    }

    public static void findChetNums(){
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        for (Integer employee : nums) {
            System.out.println(employee);
        }
        System.out.println();
        List<Integer> filtredList = nums.stream()
                .filter(num -> num % 2 ==0)
                .collect(Collectors.toList());

        System.out.println("Without predicate: " + filtredList.size());

        Predicate<Integer> predicate = num -> num%2==0;
        filtredList = nums.stream()
                .filter(predicate)
                .collect(Collectors.toList());

        System.out.println("With predicate: " + filtredList.size());

    }

    public static void findEmployees(){
        List<String> employeeList = new ArrayList<>();
        employeeList.add("aaa");
        employeeList.add("jbb");
        employeeList.add("ccc");
        employeeList.add("jdd");
        employeeList.add("eee");
        for (String employee : employeeList) {
            System.out.println(employee);
        }
        System.out.println();
        List<String> filtredList = employeeList.stream()
                .filter(name -> name.startsWith("j"))
                .collect(Collectors.toList());

        for (String employee : filtredList) {
            System.out.println(employee);
        }
    }
}
