package model;

public class Enemy {
    private String name;
    private final int ATK;
    private final int DEF;
    private final int SPE;

    public String getName() {
        return name;
    }

    public int getATK() {
        return ATK;
    }

    public int getDEF() {
        return DEF;
    }

    public int getSPE() {
        return SPE;
    }

    public Enemy(String name, int ATK, int DEF, int SPE) {
        this.name = name;
        this.ATK = ATK;
        this.DEF = DEF;
        this.SPE = SPE;
    }
}
