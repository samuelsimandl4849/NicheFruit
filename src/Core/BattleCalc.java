package Core;

import model.Enemy;
import model.User;

public class BattleCalc {


    public static boolean fight(User user, Enemy enemy) throws InterruptedException {
        System.out.println("CURRENTLY ATTACKING " + enemy.getName());
        int enemyDEF = enemy.getDEF();
        int enemySPE = enemy.getSPE();
        int enemyATK = enemy.getATK();
        int userSPE = user.getHero().getHP();
        int userATK = user.getHero().getAtkPerc();
        int userDEF = user.getHero().getDefPerc();
        do {
            if (userSPE > enemySPE) {
                Thread.sleep(1000);
                System.out.println("YOU ARE FASTER");
                Thread.sleep(1000);
                System.out.println("ATTACKING " + enemy.getName());
                Thread.sleep(1000);
                enemyDEF -= userATK;
                if (enemyDEF < 1){
                    Thread.sleep(1000);
                    System.out.println("YOU DEFEATED " + enemy.getName());
                    return true;
                }
                Thread.sleep(1000);
                System.out.println("ATTACKED BY " + enemy.getName());
                userDEF -= enemyATK;
                if (userDEF < 1){
                    Thread.sleep(1000);
                    System.out.println("YOU DIED");
                    return false;
                }



            } else{
                Thread.sleep(1000);
                System.out.println("YOU ARE SLOWER");
                Thread.sleep(1000);
                System.out.println("ATTACKED BY " + enemy.getName());
                userDEF -= enemyATK;
                if (userDEF < 1){
                    Thread.sleep(1000);
                    System.out.println("YOU DIED");
                    return false;
                }
                Thread.sleep(1000);
                System.out.println("ATTACKING " + enemy.getName());
                enemyDEF -= userATK;
                if (enemyDEF < 1){
                    Thread.sleep(1000);
                    System.out.println("YOU DEFEATED " + enemy.getName());
                    return true;
                }


            }
        }while(5 == 5);
    }
}
