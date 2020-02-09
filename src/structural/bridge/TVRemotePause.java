package structural.bridge;

public class TVRemotePause extends RemoteButton {

    public TVRemotePause(EnterntainmentDevice dev) {
        super(dev);
        // TODO Auto-generated constructor stub
    }
    @Override
    public void buttonNinePressed(){
        System.out.println("TV was paused");
    }
    
}
