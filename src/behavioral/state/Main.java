package behavioral.state;
class Main{
    public static void main (String[] args) {
        ATMMachine machine = new ATMMachine();

        machine.insertCard();
        machine.ejectCard();
        machine.insertPin(2344);
        machine.insertCard();
        machine.insertPin(2344);
        machine.insertPin(2344);
        machine.insertCard();
        machine.insertPin(2344);
        machine.insertPin(2344);
        machine.insertPin(2344);
        machine.insertPin(1234);
        machine.requestCash(200);
        machine.insertCard();
        machine.insertPin(1234);
        machine.requestCash(1999);
        machine.ejectCard();
        machine.insertCard();
        machine.insertPin(1234);
        machine.ejectCard();

        
    }
}
