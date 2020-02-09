
package behavioral.state;
public class NoCash implements ATMState{
    ATMMachine atmMachine;
    public NoCash(ATMMachine newATMMachine){
        atmMachine = newATMMachine;
    }

    public void insertCard() {
        // TODO Auto-generated method stub
        System.out.println("No money!");

    }

    public void ejectCard() {
        // TODO Auto-generated method stub
        System.out.println("No money!");
        atmMachine.setATMState(atmMachine.getNoCardState());
    }

    public void insertPin(int pinEntered) {
        // TODO Auto-generated method stub
        System.out.println("No money!");
    }

    public void requestCash(int cashToWithdraw) {
        // TODO Auto-generated method stub
        System.out.println("No money!");
    }

}
