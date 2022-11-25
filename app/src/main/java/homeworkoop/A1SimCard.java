package homeworkoop;

public final class A1SimCard extends SimCard {
    public A1SimCard(int balance, int number, int pinCode) {
        super(balance, "33" + number, pinCode);
    }

    @Override
    public String getOperatorName() {
        return "A1";
    }

    @Override
    public void makeCall(String simNum) {
        System.out.println("Звоню на номер " + simNum);
        int money = (simNum.startsWith("33")) ? 1 : 3;
        if (this.getBalance() < money) System.out.print("На балансе недостаточно средств. ");
        else this.setBalance(this.getBalance() - money);
    }

    @Override
    public void receiveCall(String simNum) {
        System.out.println("Принимаю звонок с номера " + simNum);
        int money = (simNum.startsWith("33")) ? 0 : 1;
        this.setBalance(this.getBalance() - money);
    }
}
