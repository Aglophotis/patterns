package ru.aglophotis.patterns.builder;

public class Tea {

    private final double volume;
    private final int sugarSpoons;

    public Tea(double volume, int sugarSpoons) {
        this.volume = volume;
        this.sugarSpoons = sugarSpoons;
    }

    public void printProperties() {
        System.out.println("Tea:\n sugar: " + sugarSpoons + "\n volume: " + volume);
    }
}
