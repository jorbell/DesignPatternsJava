package structural.bridge;

public class TVRemoteMute extends RemoteButton {

    public TVRemoteMute(EnterntainmentDevice dev) {
        super(dev);
        // TODO Auto-generated constructor stub
    }
    @Override
    public void buttonNinePressed(){
        System.out.println("TV was muted");
    }
    
}
