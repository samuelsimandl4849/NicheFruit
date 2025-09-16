package Core;

import model.Gear;
import model.Hero;
import model.User;

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
    public void start() throws IOException {
        ArrayList<Gear> gear = new ArrayList<>();
        ArrayList<Hero> heroes = new ArrayList<>();
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


        //BattleCalc.fight()
    }
}
