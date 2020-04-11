package ru.aglophotis.patterns.builder;

public class TeaBuilder implements DrinkBuilder {
    private double volume = 250;
    private int spoons = 2;

    @Override
    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public void setSugar(int spoons) {
        this.spoons = spoons;
    }

    public Tea getResult() {
        return new Tea(volume, spoons);
    }
}
