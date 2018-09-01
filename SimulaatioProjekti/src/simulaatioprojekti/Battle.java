/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulaatioprojekti;

/**
 *
 * @author BEAST
 */
public class Battle {
    //Battle
    Army playerArmy, enemyArmy;
    
    public void combat() {
        String winner;
        Random rand = new Random();
        int whoseTurn = rand.nextInt(2) + 1;
        //if 1, player starts. if 2, enemy starts
        if (whoseTurn == 1) {
            //int turn = 
        }
        while (army.getUnitList().size() > 1 && army.getUnitList().size() > 1) {
            //activeUnit = player.unitID[random]
            for (Army unit : <unitlist.get()) {
                //archers have longer range than other units
                if (activeUnitId == archer) {
                    if (rangeCheck(1) > 0) {

                    }
                } //horse riders have longer range than soldiers and peasants
                else if (activeUnitID == horse) {
                    if (rangeCheck(2) > 0) {
                        target = targetHP - activeUnitIDAttack;
                    }
                } //checks if the active unit and the enemy unit are within range of each other
                else if (enemyUnitPosX >= (activeUnitPosX - 1) && enemyUnitPosX <= (activeUnitPosX + 1) && enemyUnitPosY >= (activeUnitPosY - 1) && enemyUnitPosY <= (activeUnitPosY + 1)) {

                }
            }
            //if (player.unit[random].xposition() >= arraylist[enemies].position() 
        }
        if (army.getUnitList().size() > 1 && enemyArmygetUnitList().size() == 0) {
            winner == "The player"
            System.out.println(winner + "won! Congratulations!");
        } else {
            winner == "The enemy";
            System.out.println(winner + "won! You suck!");
        }
    }

    public void fight() {
        targetHP = targetHP - activeUnitAttack;
    }

    public boolean rangeCheck(int i) {
        int bowmanRange = 15;
        int horsemanRange = 2;
        int soldierRange = 1;
        int target;
        if (i == 1) {
            if (targeter(bowmanRange) > 0) {
                return true
            }
        } else if (i == 2) {
            targeter(horsemanRange);
            return target
        } else {
            targeter(soldierRange);
            return target
        }
    }

    public int targeter(int attackRange) {
        int target;
        int enemyUnitID;
        //testing purposes
        int enemyUnitPosX = 50;
        int activeUnitPosX = 49;
        int enemyUnitPosY = 50;
        int activeUnitPosY = 51;
        //checks if the enemy unit is within the range of the attacker
        if (enemyUnitPosX >= (activeUnitPosX - attackRange) && enemyUnitPosX <= (activeUnitPosX + attackRange) && enemyUnitPosY >= (activeUnitPosY - attackRange) && enemyUnitPosY <= (activeUnitPosY + attackRange)) {
            target = enemyUnitID;
        } else {
            target = 0;
        }
        return target;
    }
}
