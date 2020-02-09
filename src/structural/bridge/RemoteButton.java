package structural.bridge;
abstract class RemoteButton{

    private EnterntainmentDevice device;
    public RemoteButton(EnterntainmentDevice dev){
        device = dev;
    }

    public void buttonFivePressed(){
        device.buttonFivePressed();
    }
    public void buttonSixPressed(){
        device.buttonSixPressed();
    }
    public void deviceFeedback(){
        device.deviceFeedback();
    }
    public abstract void buttonNinePressed();
}
