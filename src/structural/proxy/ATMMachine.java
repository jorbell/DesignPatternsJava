package structural.proxy;

public class ATMMachine implements GetATMData {
    ATMState hasCard;
    ATMState noCard;
    ATMState hasCorrectPin;
    ATMState atmOutOfMoney;

    ATMState atmState;

    int cashInMachine = 2000;
    boolean correctPinEntered = false;

    public ATMMachine(){
        hasCard = new HasCard(this);
        noCard = new NoCard(this);
        hasCorrectPin = new HasPin(this);
        atmOutOfMoney = new NoCash(this);

        atmState = noCard;

        if(cashInMachine < 0){
            atmState = atmOutOfMoney;
        }
    
    }
    void setATMState(ATMState newATMState){
        atmState = newATMState;
    }
    public void setCashInMachine(int amount){
        cashInMachine = amount; 
    }
    public void insertPin(int pinEntered){
        atmState.insertPin(pinEntered);
    }
    public void requestCash(int cashToWithdraw){
        atmState.requestCash(cashToWithdraw); 
    }
    public void ejectCard(){
        atmState.ejectCard(); 
    }
    public void insertCard(){
        atmState.insertCard(); 
    }
    public ATMState getYesCardState(){return hasCard;}
    public ATMState getNoCardState(){return noCard;}
    public ATMState getHasPin(){return hasCorrectPin;}

    public ATMState getNoCashState() {
        return atmOutOfMoney;
    }

    public ATMState getATMData() {
        return atmState;
    }

    public int getCashInMachine() {
        return cashInMachine;
    }

}
