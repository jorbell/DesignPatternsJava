package creational.builder;
public interface RobotBuilder{
    public void buildRobotHead();
    public void buildRobotArms();
    public void buildRobotLegs();
    public void buildRobotTorso();
    public Robot getRobot();
}
