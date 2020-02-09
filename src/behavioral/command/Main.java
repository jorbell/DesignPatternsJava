package behavioral.command;

public class Main{
    public static void main (String[] args) {
        ElectronicDevice newDevice = TvRemote.getDevice();

        //Turn tv on
        TurnTvOn onCommand = new TurnTvOn(newDevice);

        DeviceButton onPressed = new DeviceButton(onCommand);

        onPressed.press();

        //Turn tv 
        TurnTvOff offCommand = new TurnTvOff(newDevice);
        onPressed = new DeviceButton(offCommand);

        onPressed.press();

        //Turn volume up
        TurnTvUp upCommand = new TurnTvUp(newDevice);
        onPressed = new DeviceButton(upCommand);
        for (int i = 0; i<10; i++) {
            onPressed.press();
        }

        //Turn volume down

        TurnTvDown downCommand = new TurnTvDown(newDevice);
        onPressed = new DeviceButton(downCommand);
        for (int i = 0; i<10; i++) {
            onPressed.press();
        }


    }
    
}
