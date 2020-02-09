package structural.adapter;
class Main{
    public static void main (String[] args) {
        EnemyTank tank = new EnemyTank();
        EnemyRobot rob = new EnemyRobot();
        EnemyAttacker robotAdapter = new EnemyRobotAdapter(rob);

        System.out.println("The robot");
        rob.reactToHuman("Paul");
        rob.walkForward();
        rob.smashWithHands();

        System.out.println("Tank");

        tank.assignDriver("Frank");
        tank.fireWeapon();
        tank.driveForward();
        System.out.println("Robot with adapter");
        robotAdapter.assignDriver("Frank");
        robotAdapter.fireWeapon();
        robotAdapter.driveForward();
    }
}

