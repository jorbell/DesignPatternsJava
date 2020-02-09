package behavioral.command;

public class TurnTvOn implements Command {
    ElectronicDevice theDevice;
    
    public TurnTvOn(ElectronicDevice newDevice){
        theDevice = newDevice;
    }
    public void execute() {
        // TODO Auto-generated method stub
        theDevice.on();
    }
}
