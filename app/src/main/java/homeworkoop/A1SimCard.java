package homeworkoop;

public final class A1SimCard extends SimCard {
    public A1SimCard(int balance, int number) {
        super(balance, "33" + number);
    }

    @Override
    public String getOperatorName() {
        return "A1";
    }

    @Override
    public void makeCall(String simNum) {
        if (simNum.startsWith("33")) {
            System.out.println("Звоню на номер " + simNum);
            if (this.getBalance() < 1) System.out.print("На балансе недостаточно средств. ");
            else {
                this.setBalance(this.getBalance() - 1);
            }
        } else if (simNum.startsWith("29") || simNum.startsWith("44")) {
            System.out.println("Звоню на номер " + simNum);
            if (this.getBalance() < 3) System.out.print("На балансе недостаточно средств. ");
            else {
                this.setBalance(this.getBalance() - 3);
            }
        } else System.out.println("Неверная симкарта.");
    }

    @Override
    public void receiveCall(String simNum) {
        if (simNum.startsWith("29") || simNum.startsWith("44")) {
            System.out.println("Принимаю звонок с номера " + simNum);
            if (this.getBalance() < 1) System.out.print("На балансе недостаточно средств. ");
            else {
                this.setBalance(this.getBalance() - 1);
            }
        } else if (!(simNum.startsWith("33"))) System.out.println("Неверная симкарта.");
        else System.out.println("Принимаю звонок с номера " + simNum);
    }
}
