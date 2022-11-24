package homeworkoop;

public final class LifeSimCard extends SimCard {
    public LifeSimCard(int balance, int number) {
        super(balance, "44" + number);
    }

    @Override
    public String getOperatorName() {
        return "Life";
    }

    @Override
    public void makeCall(String simNum) {
        if (simNum.startsWith("44")) {
            if (this.getBalance() < 1) System.out.print("На балансе недостаточно средств. ");
            else {
                this.setBalance(this.getBalance() - 1);
            }
        } else if (simNum.startsWith("29") || simNum.startsWith("33")) {
            if (this.getBalance() < 3) System.out.print("На балансе недостаточно средств. ");
            else {
                this.setBalance(this.getBalance() - 3);
            }
        } else System.out.println("Неверная симкарта.");
    }

    @Override
    public void receiveCall(String simNum) {
        if (simNum.startsWith("29") || simNum.startsWith("33")) {
            if (this.getBalance() < 1) System.out.print("На балансе недостаточно средств. ");
            else {
                this.setBalance(this.getBalance() - 1);
            }
        } else if (!(simNum.startsWith("44"))) System.out.println("Неверная симкарта.");
    }
}
