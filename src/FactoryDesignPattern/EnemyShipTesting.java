package FactoryDesignPattern;

import java.util.Scanner;

public class EnemyShipTesting {

    public static void main(String[] args) {
        EnemyShipFactory shipFactory = new EnemyShipFactory();
        EnemyShip theEnemy = null;
        Scanner userInput = new Scanner(System.in);
        System.out.println("What Type ship? (U / R / B)");

        if (userInput.hasNextLine()){
            String typeOFShip = userInput.nextLine();
            theEnemy = shipFactory.makeEnemyShip(typeOFShip);
        }
        if (theEnemy != null){
            doStuffEnemy(theEnemy);
        }else {
            System.out.println("Enter U or R or B");
        }


    }

    public static void doStuffEnemy(EnemyShip anEnemyShip){
        anEnemyShip.displayEnemyShip();
        anEnemyShip.followHeroShip();
        anEnemyShip.enemyShipShoots();
    }

}
