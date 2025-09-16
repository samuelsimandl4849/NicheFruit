package model;

import java.util.ArrayList;

public class Hero {
    private final int atkPerc;
    private final int speedPerc;
    private final int defPerc;
    private final int HP = 100;
    private String name;
    private final int gearSlots = 5;


    public Hero(int atkPerc, int speedPerc, int defPerc, String name) {
        this.atkPerc = atkPerc;
        this.speedPerc = speedPerc;
        this.defPerc = defPerc;
        this.name = name;

    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' + " "+
                "atk%=" + atkPerc +
                ", speed%=" + speedPerc +
                ", def%=" + defPerc +
                ", HP=" + HP +

                ", gear slots=" + gearSlots;
    }
}
