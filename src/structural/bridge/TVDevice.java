package structural.bridge;

class TVDevice extends EnterntainmentDevice {
    public TVDevice(int state, int max){
        deviceState = state;
        maxSetting = max;
    }

    @Override
    public void buttonFivePressed() {
        // TODO Auto-generated method stub

        System.out.println("Channel down");
        deviceState--;
    }

    @Override
    public void buttonSixPressed() {
        // TODO Auto-generated method stub
        System.out.println("Channel down");
        deviceState++;
    }
    
}
