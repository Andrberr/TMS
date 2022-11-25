package homeworkoop;

public final class LifeSimCard extends SimCard {
    public LifeSimCard(int balance, int number, int pinCode) {
        super(balance, "44" + number, pinCode);
    }

    @Override
    public String getOperatorName() {
        return "Life";
    }

    @Override
    public void makeCall(String simNum) {
        System.out.println("Звоню на номер " + simNum);
        int money = (simNum.startsWith("44")) ? 1 : 3;
        if (this.getBalance() < money) System.out.print("На балансе недостаточно средств. ");
        else this.setBalance(this.getBalance() - money);
    }

    @Override
    public void receiveCall(String simNum) {
        System.out.println("Принимаю звонок с номера " + simNum);
        int money = (simNum.startsWith("44")) ? 0 : 1;
        this.setBalance(this.getBalance() - money);
    }
}
