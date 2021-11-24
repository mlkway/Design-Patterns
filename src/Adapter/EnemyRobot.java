package Adapter;

import java.util.Random;

public class EnemyRobot {
    Random generator = new Random();

    public void smashWithHands(){
        int attackDamage = generator.nextInt(10) + 1;
        System.out.println("Enemy Robot Causes " + attackDamage + "damage with its hand" );
    }

    public void walkForward(){
        int movement = generator.nextInt(5)+1;
        System.out.println("Eney robot walks forward " + movement + " Spaces");
    }

    public void reactToHuman(String driverName){
        System.out.println("Enemy Robots Tramps on " + driverName);
    }

}
