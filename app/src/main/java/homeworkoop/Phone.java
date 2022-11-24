package homeworkoop;

public class Phone {
    private SimCard sim;

    public Phone(SimCard sim) {
        this.sim = sim;
    }

    public SimCard getSim() {
        return sim;
    }

    public void insertNewSim(SimCard newSim) {
        sim = newSim;
        System.out.println("Новая симка телефона: Номер = " + newSim.getNumber() + ", Оператор = " + newSim.getOperatorName() + ", Баланс = " + newSim.getBalance());
    }

    public void makeCall(String simNum) {
        sim.makeCall(simNum);
    }

    public void receiveCall(String simNum) {
        sim.receiveCall(simNum);
    }

    public void printBalance() {
        System.out.println("Баланс = " + sim.getBalance());
    }
}
