package model;

public class Gear {
    private final int price;
    private String name;
    private String stat;
    private final int value;

    public Gear(int price, String name, String stat, int value) {
        this.price = price;
        this.name = name;
        this.stat = stat;
        this.value = value;
    }
}
