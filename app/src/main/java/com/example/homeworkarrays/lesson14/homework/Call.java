package com.example.homeworkarrays.lesson14.homework;

public class Call {
    private final int id;
    private final String goal;
    private static final String[] CALL_GOALS = {"Деловой разговор", "Весёлый разговор", "Напряжённый разговор", "Сложный разговор", "Дружеский разговор"};

    public Call(int id, String goal) {
        this.id = id;
        this.goal = goal;
    }

    public int getId() {
        return id;
    }

    public String getGoal() {
        return goal;
    }

    public void printCallInfo(){
        System.out.print("Id звонка = " + this.getId() + ", Цель звонка = " + this.getGoal());
    }

    public static String getCallGoal(){
        return CALL_GOALS[(int)(Math.random()*5)];
    }
}
