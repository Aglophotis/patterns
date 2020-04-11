package ru.aglophotis.patterns.builder;

public class CoffeeBuilder implements DrinkBuilder {
    private double volume = 100;
    private int spoons = 0;

    @Override
    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public void setSugar(int spoons) {
        this.spoons = spoons;
    }

    public Coffee getResult() {
        return new Coffee(volume, spoons);
    }
}
