package homeworkoop;

import java.util.Scanner;

public class Practice {
    static Scanner in = new Scanner(System.in);

    public static SimCard randomSim(int number) {
        int operator = (int) (1 + Math.random() * 3);
        int balance = (int) (1 + Math.random() * 10);
        if (operator == 1) return new MtsSimCard(balance, number);
        else if (operator == 2) return new A1SimCard(balance, number);
        else return new LifeSimCard(balance, number);
    }

    public static void main(String[] args) {
        int arraySize = (int) (1 + Math.random() * 10);
        SimCard[] simCards = new SimCard[arraySize];
        for (int i = 0; i < simCards.length; i++) {
            System.out.print("Введите номер телефона симки: ");
            simCards[i] = randomSim(in.nextInt());
        }
        System.out.println("Список Симок:");
        for (SimCard sim : simCards) {
            System.out.println("Номер = " + sim.getNumber() + ", Оператор = " + sim.getOperatorName() + ", Баланс = " + sim.getBalance());
        }

        Phone phone = new Phone(randomSim((int) (1000000 + Math.random() * 9000000)));
        System.out.println("Симка телефона: Номер = " + phone.getSim().getNumber() + ", Оператор = " + phone.getSim().getOperatorName() + ", Баланс = " + phone.getSim().getBalance());
        System.out.println();

        for (int i = 0; i < simCards.length; i++) {
            if ((i + 1) % 2 == 0) {
                phone.makeCall(simCards[i].getNumber());
            } else {
                phone.receiveCall(simCards[i].getNumber());
            }
            phone.printBalance();
        }
    }
}
