package com.example.homeworkarrays;

import java.util.Arrays;
import java.util.Scanner;

public class Reader {
    String fio;
    int ticketNum;
    String faculty;
    String dateOfBirth;
    String phoneNumber;

    public Reader(String fio, int ticketNum, String faculty, String dateOfBirth, String phoneNumber){
        this.fio = fio;
        this.ticketNum = ticketNum;
        this.faculty = faculty;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
    }

    public String getFio() {
        return fio;
    }
    public void takeBook(){
    }

    public void takeBook(int bookKol){
        System.out.println(this.getFio()+ " взял " + bookKol+ " книги.");
    }

    public void takeBook(String... books){
        System.out.print(this.getFio()+ " взял книги: ");
        for (String book:books){
            System.out.print(book + " ");
        }
    }

    public void takeBook(Book... books){
        System.out.print(this.getFio()+ " взял книги: ");
        for (Book book:books){
            System.out.print(book.getNameOfBook() + " ");
        }
    }

    public void returnBook(){
    }

    public void returnBook(int bookKol){
        System.out.println(this.getFio()+ " вернул " + bookKol+ " книги.");
    }

    public void returnBook(String... books){
        System.out.print(this.getFio()+ " вернул книги: ");
        for (String book:books){
            System.out.print(book + " ");
        }
    }

    public void returnBook(Book... books){
        System.out.print(this.getFio()+ " вернул книги: ");
        for (Book book:books){
            System.out.print(book.getNameOfBook() + " ");
        }
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество читателей: ");
        int kolReaders = in.nextInt();
        Reader[] readers = new Reader[kolReaders];
        String fio;
        int ticketNum;
        String faculty;
        String dateOfBirth;
        String phoneNumber;
        for (int i=0; i<readers.length; i++){
            System.out.println("Введите фио читателя: ");
            fio = in.next();
            System.out.println("Введите номер читательского билета читателя: ");
            ticketNum = in.nextInt();
            System.out.println("Введите факультет читателя: ");
            faculty = in.next();
            System.out.println("Введите дату рождения читателя: ");
            dateOfBirth = in.next();
            System.out.println("Введите номер читателя: ");
            phoneNumber = in.next();
            readers[i] = new Reader(fio, ticketNum, faculty, dateOfBirth, phoneNumber);
        }
        readers[0].takeBook(3);
        readers[0].takeBook("Приключения", "Словарь", "Энциклопедия");
        readers[0].takeBook(new Book("Приключения", "Автор1"), new Book("Словарь", "Автор2"));
        readers[0].returnBook(3);
        readers[0].returnBook("Приключения", "Словарь", "Энциклопедия");
        readers[0].returnBook(new Book("Приключения", "Автор1"), new Book("Словарь", "Автор2"));

    }
}
