import Core.Dungeon;
import model.Hero;
import model.User;
import ui.InputHandler;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {

    static void initialize() throws IOException {
        String prompt = "napis cislo postavy kterou si chces vybrat";
        ArrayList<Hero> heroes = new ArrayList<>();
        List<String> lines = Files.readAllLines(Paths.get("HeroList"));
        String[] params;
        for(String line : lines){
            params = line.split(";");
            heroes.add(
                    new Hero(
                            Integer.parseInt(params[0]),
                            Integer.parseInt(params[1]),
                            Integer.parseInt(params[2]),
                            params[3]
            ));
        }


        User user = new User(InputHandler.readText("napis jmeno"), heroes.get(InputHandler.chooseHero(prompt, heroes)));
        System.out.println(user);
        Dungeon dungeon = new Dungeon(user);
        dungeon.start();


    }
    public static void main(String[] args) throws IOException {
        initialize();
    }
}