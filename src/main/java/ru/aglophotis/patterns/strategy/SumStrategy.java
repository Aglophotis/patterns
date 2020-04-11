package ru.aglophotis.patterns.strategy;

public class SumStrategy implements Strategy {

    @Override
    public int execute(int a, int b) {
        return a + b;
    }
}
