package org.example.rpg;

import javax.management.monitor.MonitorMBean;

public class RpgMain {
    public static void main(String[] args) {
        Monster shrek = new Troll("shrek", 1000,40);
        Monster wolf = new Werewolf("wolf",500,100);

        printAttackResult(shrek);
        printAttackResult(wolf);

    }

    private static void printAttackResult(Monster monster) {
        System.out.println("Attack result of:" + monster.getName()+":" + monster.attack());
    }
}
