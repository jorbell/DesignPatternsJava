package structural.adapter;

class EnemyRobotAdapter implements EnemyAttacker {

    EnemyRobot rob;
    public EnemyRobotAdapter(EnemyRobot newRobot){
        rob = newRobot;
    }
    public void fireWeapon() {
        // TODO Auto-generated method stub
        rob.smashWithHands();
        

    }

    public void driveForward() {
        // TODO Auto-generated method stub
        rob.walkForward();
    }

    public void assignDriver(String driver) {
        // TODO Auto-generated method stub
        rob.reactToHuman(driver);
    }
    
}
