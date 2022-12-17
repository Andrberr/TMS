package com.example.homeworkarrays.lesson13.practice;

import java.util.InputMismatchException;
import java.util.Optional;
import java.util.Scanner;

public class OptonalClass {
    public static void main(String[] args) {
        Optional<Integer> opt = Optional.ofNullable(enterNumber());
        boolean optNotNull = opt.isPresent();
        if (optNotNull) System.out.println(opt.get());
        else System.out.println("Некорректный ввод.");
    }

    public static Integer enterNumber(){
        Scanner in = new Scanner(System.in);
        try{
            int number = in.nextInt();
            return number;
        }catch(InputMismatchException e){
            return null;
        }
    }
}
