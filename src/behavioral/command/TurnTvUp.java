package behavioral.command;

public class TurnTvUp implements Command {
    ElectronicDevice theDevice;
    
    public TurnTvUp(ElectronicDevice newDevice){
        theDevice = newDevice;
    }
    public void execute() {
        // TODO Auto-generated method stub
        theDevice.volumeUp();
    }
}
