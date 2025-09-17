package model;

public class User {
    final String name;
    private int money = 100;

    private Hero hero;
    private Gear[] gearList;

    public String getName() {
        return name;
    }

    public int getMoney() {
        return money;
    }

    public Hero getHero() {
        return hero;
    }

    public Gear[] getGearList() {
        return gearList;
    }

    public User(String name, Hero hero) {
        this.name = name;
        this.hero = hero;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", money=" + money +
                ", hero=" + hero.getName() +
                '}';
    }
}
