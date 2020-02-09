package structural.proxy;
public class NoCard implements ATMState{
    ATMMachine atmMachine;
    public NoCard(ATMMachine newATMMachine){
        atmMachine = newATMMachine;
    }

    public void insertCard() {
        // TODO Auto-generated method stub
        System.out.println("Card is being read");
        atmMachine.setATMState(atmMachine.getYesCardState());

    }

    public void ejectCard() {
        // TODO Auto-generated method stub
        System.out.println("No card inserted");
    }

    public void insertPin(int pinEntered) {
        // TODO Auto-generated method stub
        System.out.println("No card inserted");
    }

    public void requestCash(int cashToWithdraw) {
        // TODO Auto-generated method stub
        System.out.println("No card inserted");
    }

}
