package com.example.homeworkarrays.lesson9.homework;

public class Document {
    private static final String DOCUMENT_REGEXP = "\\d{4}-[A-z]{3}-\\d{4}-[A-z]{3}-\\d[A-z]\\d[A-z]";

    public static boolean checkDocumentInput(String documentNum) {
        if (documentNum.matches(DOCUMENT_REGEXP)) return true;
        return false;
    }

    public static void printTwoBlocksNumbers(String documentNum) {
        System.out.println(documentNum.substring(0, 4) + documentNum.substring(8, 13));
    }

    public static void printDocumentNumReplaced(String documentNum) {
        System.out.println(documentNum.replaceAll("[A-z]", "*"));
    }

    public static void printDocumentLetters(String documentNum) {
        StringBuilder docNum = new StringBuilder();
        docNum.append(documentNum.substring(5, 8).toUpperCase()).append("/").append(documentNum.substring(14, 17).toUpperCase()).append("/").append(documentNum.substring(19,20).toUpperCase()).append("/").append(documentNum.substring(21,22).toUpperCase());
        System.out.println("Letters:" + docNum);
    }

    public static boolean checkForLetterSequence(String documentNum) {
        return documentNum.contains("abc") || documentNum.contains("ABC");
    }

    public static boolean checkEndsWithSequence(String documentNum) {
        return documentNum.endsWith("1a2b");
    }
}
