package com.example.homeworkarrays.lesson10.homework;

import java.util.Scanner;

public class InputDocument {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String documentNum;
        boolean correctInput = false;
        do {
            System.out.println("Input document number:");
            documentNum = in.nextLine();
            if (Document.checkDocumentInput(documentNum)) correctInput = true;
            else System.out.println("Incorrect format of document number. Try again:");
        } while (!correctInput);
        Document.operateWithDocumentNum(documentNum);
    }
}
