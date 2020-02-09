package behavioral.command;

public class TurnTvDown implements Command {
    ElectronicDevice theDevice;
    
    public TurnTvDown(ElectronicDevice newDevice){
        theDevice = newDevice;
    }
    public void execute() {
        // TODO Auto-generated method stub
        theDevice.volumeDown();
    }
}
