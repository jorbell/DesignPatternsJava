package structural.bridge;
class Main{
    public static void main (String[] args) {
        RemoteButton theTV = new TVRemoteMute(new TVDevice(1,200));
        RemoteButton theTV2 = new TVRemotePause(new TVDevice(1,200));

        System.out.println("Test tv with mute");
        theTV.buttonFivePressed();
        theTV.buttonSixPressed();
        theTV.buttonNinePressed();
        System.out.println("Test tv with pause");
        theTV2.buttonFivePressed();
        theTV2.buttonSixPressed();
        theTV2.buttonSixPressed();
        theTV2.buttonSixPressed();
        theTV2.buttonSixPressed();
        theTV2.buttonNinePressed();
        
    }
}
