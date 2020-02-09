package creational.builder;
public class RobotEngineer{
    private RobotBuilder robotBuilder;

    public RobotEngineer(RobotBuilder robotBuilder){
        this.robotBuilder = robotBuilder;
    }

    public Robot getRobot(){
        return robotBuilder.getRobot();
    }
    public void makeRobot(){
        this.robotBuilder.buildRobotHead();
        this.robotBuilder.buildRobotArms();
        this.robotBuilder.buildRobotTorso();
        this.robotBuilder.buildRobotLegs();
    }
}
