package ru.aglophotis.patterns.strategy;

public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void executeStrategy(int a, int b) {
        System.out.println(strategy.execute(a, b));
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
