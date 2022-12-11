package com.example.homeworkarrays.lesson11.homework;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class User extends ArrayList {
    private String userName;
    private ArrayDeque<String> messages = new ArrayDeque<String>();

    public User(String userName) {
        this.userName = userName;
    }

    public Queue<String> getMessages() {
        return this.messages;
    }

    public String getUserName() {
        return this.userName;
    }

    public void writeMessages(String message) {
        this.messages.offer(message);
    }

    public void readMessages() {
        if (this.getMessages().isEmpty()) System.out.println("Список сообщений пуст");
        else {
            System.out.println("Список сообщений: ");
            while (!this.getMessages().isEmpty()) {
                System.out.println(this.messages.pollFirst());
            }
        }
    }

    @Override
    public boolean equals(Object o) {
        o = (User) o;
        if (this.getUserName().equals(((User) o).getUserName())) return true;
        return false;
    }
}
