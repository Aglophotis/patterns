package ru.aglophotis.patterns.builder;

public class Coffee {

    private final double volume;
    private final int sugarSpoons;

    public Coffee(double volume, int sugarSpoons) {
        this.volume = volume;
        this.sugarSpoons = sugarSpoons;
    }

    public void printProperties() {
        System.out.println("Coffee:\n sugar: " + sugarSpoons + "\n volume: " + volume);
    }
}
