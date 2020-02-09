package structural.adapter;

import java.util.Random;

public class EnemyTank implements EnemyAttacker {

    Random generator = new Random();
    public void fireWeapon() {
        // TODO Auto-generated method stub
        int attackDamage = generator.nextInt(10) + 1;
        System.out.println("Enemy tank does " + attackDamage + " damage");

    }

    public void driveForward() {
        // TODO Auto-generated method stub
        int movement = generator.nextInt(20) + 1;
        System.out.println("Enemy tank moves " + movement + " meters");

    }

    public void assignDriver(String driver) {
        // TODO Auto-generated method stub
        System.out.println("Enemy tank driver is: " + driver);
    }
    
}
