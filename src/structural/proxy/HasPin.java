package structural.proxy;
public class HasPin implements ATMState{
    ATMMachine atmMachine;
    public HasPin(ATMMachine newATMMachine){
        atmMachine = newATMMachine;
    }

    public void insertCard() {
        // TODO Auto-generated method stub
        System.out.println("Card already insterted");

    }

    public void ejectCard() {
        // TODO Auto-generated method stub
        System.out.println("Card ejected");
        atmMachine.setATMState(atmMachine.getNoCardState());
    }

    public void insertPin(int pinEntered) {
        // TODO Auto-generated method stub
        System.out.println("Pin already entered");
    }

    public void requestCash(int cashToWithdraw) {
        // TODO Auto-generated method stub
        if (cashToWithdraw <= atmMachine.cashInMachine){
            System.out.println(cashToWithdraw + " is withrawed ");
            atmMachine.setCashInMachine(atmMachine.cashInMachine - cashToWithdraw);

            System.out.println("Card Ejected");
            atmMachine.setATMState(atmMachine.getNoCardState());
        }else{
            System.out.println("Not enought cash, choose another amount");
        }
    }

}
