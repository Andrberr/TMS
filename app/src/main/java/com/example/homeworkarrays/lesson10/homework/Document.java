package com.example.homeworkarrays.lesson10.homework;

public class Document {
    private static final String DOCUMENT_REGEXP = "\\d{4}-[A-z]{3}-\\d{4}-[A-z]{3}-\\d[A-z]\\d[A-z]";

    public static boolean checkDocumentInput(String documentNum) {
        if (documentNum.matches(DOCUMENT_REGEXP)) return true;
        return false;
    }

    private static void printTwoBlocksNumbers(String documentNum) {
        System.out.println(documentNum.substring(0, 4) + documentNum.substring(8, 13));
    }

    private static void printDocumentNumReplaced(String documentNum) {
        System.out.println(documentNum.replaceAll("[A-z]", "*"));
    }

    private static void printDocumentLetters(String documentNum) {
        StringBuilder docNum = new StringBuilder();
        docNum.append(documentNum.substring(5, 8).toUpperCase()).append("/").append(documentNum.substring(14, 17).toUpperCase()).append("/").append(documentNum.substring(19, 20).toUpperCase()).append("/").append(documentNum.substring(21, 22).toUpperCase());
        System.out.println("Letters:" + docNum);
    }

    private static void checkForABCSequence(String documentNum) {
        if (documentNum.contains("abc") || documentNum.contains("ABC"))
            System.out.println("Номер документа содержит последовательность abc");
        else System.out.println("Номер документа не содержит последовательность abc");
    }

    private static void checkEndsNumber(String documentNum) {
        if (documentNum.endsWith("1a2b"))
            System.out.println("Номер документа заканчивается последовательностью 1a2b");
        else System.out.println("Номер документа не заканчивается последовательностью 1a2b");
    }

    public static void operateWithDocumentNum(String documentNum) {
        printTwoBlocksNumbers(documentNum);
        printDocumentNumReplaced(documentNum);
        printDocumentLetters(documentNum);
        checkForABCSequence(documentNum);
        checkEndsNumber(documentNum);
    }
}
