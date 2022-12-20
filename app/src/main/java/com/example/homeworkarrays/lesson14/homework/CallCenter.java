package com.example.homeworkarrays.lesson14.homework;

import java.util.ArrayDeque;

public class CallCenter {
    private final static int CALL_AMOUNT = 8;

    public static void main(String[] args) {
        ArrayDeque<Call> calls = createCalls();
        acceptCalls(calls);
    }

    public static ArrayDeque<Call> createCalls() {
        ArrayDeque<Call> calls = new ArrayDeque<>();
        for (int i = 1; i <= CALL_AMOUNT; i++) {
            calls.add(new Call(i, Call.getCallGoal()));
        }
        for (Call call : calls) {
            call.printCallInfo();
            System.out.println();
        }
        System.out.println();
        return calls;
    }

    public static void acceptCalls(ArrayDeque<Call> calls) {
        Runnable runnable = () -> {
            while (!calls.isEmpty()) {
                synchronized (calls) {
                    if (calls.peek() != null) {
                        calls.peek().printCallInfo();
                        System.out.println(", Обработан работником " + Thread.currentThread().getName());
                        calls.pop();
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {}
                    }
                }
            }
        };
        Thread firWorker = new Thread(runnable);
        firWorker.setName("Andrey");
        Thread secWorker = new Thread(runnable);
        secWorker.setName("Nikita");
        Thread thirdWorker = new Thread(runnable);
        thirdWorker.setName("Dima");

        firWorker.start();
        secWorker.start();
        thirdWorker.start();
    }
}
