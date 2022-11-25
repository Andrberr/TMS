package homeworkoop;

public class SimCard {
    private int balance;
    private String number;

    protected SimCard(int balance, String number) {
        this.balance = balance;
        this.number = number;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getNumber() {
        return number;
    }

    public String getOperatorName() {
        return null;
    }

    public void makeCall(String simNum) {
        if (this.getBalance() <= 0) System.out.println("Звонок запрещён.");
        else System.out.println("Звоню на номер " + this.getNumber() + ".");
    }

    public void receiveCall(String simNum) {
        System.out.println("Принимаю звонок с номера " + this.getNumber() + ".");
    }

    public void printInfo() {
        System.out.println("Номер = " + this.getNumber() + ", Оператор = " + this.getOperatorName() + ", Баланс = " + this.getBalance());
    }
}
