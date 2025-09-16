package model;

public class User {
    private final String name;
    private int money = 100;

    private Hero hero;
    private Gear[] gearList;

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
