package homeworkoop;

public class Phone {
    private SimCard sim;
    public boolean phoneStatus;

    public Phone(SimCard sim) {
        this.sim = sim;
        this.phoneStatus = false;
    }

    public SimCard getSim() {
        return sim;
    }

    public boolean isPhoneStatus() {
        return phoneStatus;
    }

    public void insertNewSim(SimCard newSim) {
        this.sim = newSim;
        this.getSim().checkPinCode();
        if (!this.getSim().isSimIsBlocked())
            System.out.println("Новая симка телефона: Номер = " + newSim.getNumber() + ", Оператор = " + newSim.getOperatorName() + ", Баланс = " + newSim.getBalance());
    }

    public void makeCall(String simNum) {
        getSim().makeCall(simNum);
    }

    public void receiveCall(String simNum) {
        getSim().receiveCall(simNum);
    }

    public void printBalance() {
        System.out.println("Баланс = " + this.getSim().getBalance());
    }

    public void turnOn() {
        this.phoneStatus = true;
    }

    public void turnOff() {
        this.phoneStatus = false;
    }
}
