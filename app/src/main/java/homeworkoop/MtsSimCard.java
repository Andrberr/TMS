package homeworkoop;

public final class MtsSimCard extends SimCard {
    public MtsSimCard(int balance, int number) {
        super(balance, "29" + number);
    }

    @Override
    public String getOperatorName() {
        return "MTS";
    }

    @Override
    public void makeCall(String simNum) {
        if (simNum.startsWith("29")) {
            if (this.getBalance() < 1) System.out.print("На балансе недостаточно средств. ");
            else {
                this.setBalance(this.getBalance() - 1);
            }
        } else if (simNum.startsWith("33") || simNum.startsWith("44")) {
            if (this.getBalance() < 3) System.out.print("На балансе недостаточно средств .");
            else {
                this.setBalance(this.getBalance() - 3);
            }
        } else System.out.println("Неверная симкарта.");
    }

    @Override
    public void receiveCall(String simNum) {
        if (simNum.startsWith("33") || simNum.startsWith("44")) {
            if (this.getBalance() < 1) System.out.print("На балансе недостаточно средств. ");
            else {
                this.setBalance(this.getBalance() - 1);
            }
        } else if (!(simNum.startsWith("29"))) System.out.println("Неверная симкарта.");
    }
}
