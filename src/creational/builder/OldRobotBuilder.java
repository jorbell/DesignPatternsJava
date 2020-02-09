package creational.builder;
public class OldRobotBuilder implements RobotBuilder{
    private Robot robot;
    public OldRobotBuilder(){
        this.robot = new Robot(); 
    }

    public void buildRobotHead() {
        robot.setRobotHead("Tin head");
    }

    public void buildRobotArms() {
        robot.setRobotArms("Old tin arms");

    }

    public void buildRobotLegs() {
        robot.setRobotLegs("Roller skates");

    }

    public void buildRobotTorso() {
        robot.setRobotTorso("Tin torso");

    }
    public Robot getRobot(){
        return this.robot;
    }
}
