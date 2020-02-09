package behavioral.command;

public class TurnTvOff implements Command {
    ElectronicDevice theDevice;
    
    public TurnTvOff(ElectronicDevice newDevice){
        theDevice = newDevice;
    }
    public void execute() {
        // TODO Auto-generated method stub
        theDevice.off();
    }
}
