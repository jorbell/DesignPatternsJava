package structural.proxy;

public class ATMProxy implements GetATMData {

    public ATMState getATMData() {
        // TODO Auto-generated method stub
        ATMMachine atmMachine = new ATMMachine();
        return atmMachine.getATMData();
    }

    public int getCashInMachine() {
        // TODO Auto-generated method stub
        ATMMachine atmMachine = new ATMMachine();
        return atmMachine.getCashInMachine();
    }
    
}
