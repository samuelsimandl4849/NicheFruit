package Core;

import model.Enemy;
import model.Gear;
import model.Hero;
import model.User;
import utils.RandomGen;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Dungeon {
    User user;
    public Dungeon(User user){
        this.user = user;
    }
    public void start() throws IOException, InterruptedException {
        ArrayList<Gear> gear = new ArrayList<>();
        List<String> lines = Files.readAllLines(Paths.get("GearList"));
        String[] params;
        for(String line : lines){
            params = line.split(";");
            gear.add(
                    new Gear(
                            Integer.parseInt(params[0]),
                            (params[1]),
                            (params[2]),
                            Integer.parseInt(params[3])
                    ));
        }
        ArrayList<Enemy> enemies = new ArrayList<>();
        List<String> eLines = Files.readAllLines(Paths.get("EnemyList"));
        String[] eParams;
        for(String line : eLines){
            eParams = line.split(";");
            enemies.add(
                    new Enemy(
                            eParams[0],
                            Integer.parseInt(eParams[1]),
                            Integer.parseInt(eParams[2]),
                            Integer.parseInt(eParams[3])
                    ));
        }


        do{
            Thread.sleep(2000);
        }while (BattleCalc.fight(user, enemies.get(RandomGen.getRandomInt(0, enemies.size()-1))));
        //BattleCalc.fight()
    }
}
