package ui;

import model.Gear;
import model.Hero;

import java.util.ArrayList;
import java.util.Scanner;

public class InputHandler {
    private static final Scanner sc = new Scanner(System.in);
    public static int chooseHero(String prompt, ArrayList<Hero> choices){
        System.out.println(prompt);
        for (int i = 1; i < choices.size()+1; i++) {
            System.out.println(i + ": " + choices.get(i-1));
        }
        int choice = sc.nextInt()-1;
        return choice;
    }
    public static String readText(String prompt){
        System.out.println(prompt);
        return sc.nextLine();
    }
    public static int pickGear(Gear[] gear){
        for (int i = 1; i < gear.length+1; i++) {
            System.out.println(i + ": " + gear[i-1]);
        }
        return sc.nextInt()-1;

    }
    public static Gear shopGear(Gear[] shopGear){
        for (int i = 0; i < shopGear.length + 1; i++) {
            System.out.println(i + ": " + shopGear[i-1]);
        }
        int choice = sc.nextInt();
        return shopGear[choice-1];
    }
}
