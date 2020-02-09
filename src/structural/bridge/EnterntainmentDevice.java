package structural.bridge;
abstract class EnterntainmentDevice{
    public int deviceState;
    public int maxSetting;
    public int volumeLevel;
    public abstract void buttonFivePressed();
    public abstract void buttonSixPressed();

    public void deviceFeedback(){
        if(deviceState > maxSetting || deviceState < 0) {deviceState = 0;}
        System.out.println("On " + deviceState);

    }
    public void buttonEightPressed(){
        volumeLevel--;
        System.out.println("Volume at: " + volumeLevel);
    }
    public void buttonSevenPressed(){
        volumeLevel++;
        System.out.println("Volume at: " + volumeLevel);
    }
}
