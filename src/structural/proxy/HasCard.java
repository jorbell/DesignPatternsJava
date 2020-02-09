package structural.proxy;
public class HasCard implements ATMState{
    ATMMachine atmMachine;
    public HasCard(ATMMachine newATMMachine){
        atmMachine = newATMMachine;
    }

    public void insertCard() {
        // TODO Auto-generated method stub
        System.out.println("You can't enter more than one card");
    }

    public void ejectCard() {
        // TODO Auto-generated method stub
        System.out.println("Card Ejected");
        atmMachine.setATMState(atmMachine.getNoCardState());
    }

    public void insertPin(int pinEntered) {
        // TODO Auto-generated method stub
        if(pinEntered == 1234){
            System.out.println("Pin correct");
            atmMachine.setATMState(atmMachine.getHasPin());
        }
        else{
            System.out.println("Wrong pin");
        }
    }

    public void requestCash(int cashToWithdraw) {
        // TODO Auto-generated method stub
        System.out.println("Enter pin first");
    }

}
