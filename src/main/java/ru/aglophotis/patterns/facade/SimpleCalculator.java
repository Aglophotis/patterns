package ru.aglophotis.patterns.facade;

public class SimpleCalculator {

    public void printResultOfSimpleOperations(int a, int b) {
        System.out.println("sub: " + SubOperation.sub(a, b));
        System.out.println("sum: " + SumOperation.sum(a, b));
    }
}
