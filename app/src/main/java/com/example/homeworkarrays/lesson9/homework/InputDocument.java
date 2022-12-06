package com.example.homeworkarrays.lesson9.homework;

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

        Document.printTwoBlocksNumbers(documentNum);
        Document.printDocumentNumReplaced(documentNum);
        Document.printDocumentLetters(documentNum);
        if (Document.checkForLetterSequence(documentNum))
            System.out.println("Номер документа содержит последовательность abc");
        else System.out.println("Номер документа не содержит последовательность abc");
        if (Document.checkEndsWithSequence(documentNum))
            System.out.println("Номер документа заканчивается последовательностью 1a2b");
        else System.out.println("Номер документа не заканчивается последовательностью 1a2b");
    }
}
