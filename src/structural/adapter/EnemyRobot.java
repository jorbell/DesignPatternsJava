package structural.adapter;

import java.util.Random;

public class EnemyRobot{
    Random generator = new Random();

    public void smashWithHands(){
        int attackDamage = generator.nextInt(14)+1;
        System.out.println("Enemy robot causes " + attackDamage + " damage");
    }
    public void walkForward(){
    
        int movement = generator.nextInt(9)+1;
        System.out.println("Enemy robot walks " + movement + " meters");
    }
    public void reactToHuman(String driverName){
            System.out.println("Enemy robot stomps on " + driverName);
    
    }
}
