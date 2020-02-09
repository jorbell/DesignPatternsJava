package behavioral.command;

public class Television implements ElectronicDevice {
    private int volume = 0;

    public void on() {
        // TODO Auto-generated method stub
        System.out.println("Tv is on");
    }

    public void off() {
        // TODO Auto-generated method stub
        System.out.println("TV is off");
    }

    public void volumeUp() {
        // TODO Auto-generated method stub

        volume++;
        System.out.println("TV volume is at " + volume);
    }

    public void volumeDown() {
        // TODO Auto-generated method stub
        volume--;
        System.out.println("TV volume is at " + volume);
    }
    
}
