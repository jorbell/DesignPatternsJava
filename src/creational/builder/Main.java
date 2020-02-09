package creational.builder;
public class Main{
    public static void main (String[] args) {
        RobotBuilder oldbuilder = new OldRobotBuilder();
        RobotEngineer robotEngineer = new RobotEngineer(oldbuilder);
        robotEngineer.makeRobot();

        Robot robot1 = robotEngineer.getRobot();
        System.out.println("Robot built");
        System.out.println("Robot has: " + robot1.getRobotTorso());
        System.out.println("Robot has: " + robot1.getRobotArms());
        System.out.println("Robot has: " + robot1.getRobotLegs());
        System.out.println("Robot has: " + robot1.getRobotHead());
    }
}
