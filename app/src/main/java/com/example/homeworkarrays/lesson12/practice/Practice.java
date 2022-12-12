package com.example.homeworkarrays.lesson12.practice;

import java.util.HashMap;
import java.util.Map;

public class Practice {
    public static void main(String[] args) {
        HashMap<String, Product> toys = new HashMap<>();
        toys.put("Кукла", new Product(10));
        toys.put("Медведь", new Product(12));
        toys.put("Заяц", new Product(7));
        printEntrySet(toys);
        System.out.println();
        printKeys(toys);
        System.out.println();
        printValues(toys);
    }

    public static void printEntrySet(HashMap<String, Product> toys){
        for(Map.Entry<String, Product> entry: toys.entrySet()) {
            System.out.println(entry.getKey() +" " +entry.getValue().getPrice());
        }
    }

    public static void printKeys(HashMap<String, Product> toys){
        System.out.println("Keys:");
        for(String key: toys.keySet()) {
            System.out.println(key);
        }
    }

    public static void printValues(HashMap<String, Product> toys){
        System.out.println("Values:");
        for(Product value: toys.values()) {
            System.out.println(value.getPrice());
        }
    }
}
