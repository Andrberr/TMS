package homeworkoop;

import java.util.Scanner;

public class Practice {
    static Scanner in = new Scanner(System.in);

    public static SimCard randomSim() {
        int operator = (int) (1 + Math.random() * 3);
        int balance = (int) (1 + Math.random() * 10);
        int number = (int) (1000000 + Math.random() * 9000000);
        if (operator == 1) return new MtsSimCard(balance, number);
        else if (operator == 2) return new A1SimCard(balance, number);
        else return new LifeSimCard(balance, number);
    }

    public static void printSims(SimCard[] sims) {
        System.out.println("Список Симок:");
        for (SimCard sim : sims) {
            sim.printInfo();
        }
    }

    public static void main(String[] args) {
        int arraySize = (int) (1 + Math.random() * 10);
        SimCard[] simCards = new SimCard[arraySize];
        for (int i = 0; i < simCards.length; i++) {
            simCards[i] = randomSim();
        }
        printSims(simCards);
        Phone phone = new Phone(null);
        System.out.println();

        for (int i = 0; i < simCards.length; i++) {
            phone.insertNewSim(simCards[i]);
            System.out.print("Введите номер симки: ");
            if ((i + 1) % 2 == 0) {
                phone.makeCall(in.nextLine());
            } else {
                phone.receiveCall(in.nextLine());
            }
            phone.printBalance();
        }
        System.out.println();
        printSims(simCards);
    }
}
