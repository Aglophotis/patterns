package ru.aglophotis.patterns.facade;

public class ApplicationRunner {
    public static void main(String[] args) {
        ApplicationRunner runner = new ApplicationRunner();
        runner.run();
    }

    private void run() {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        simpleCalculator.printResultOfSimpleOperations(10, 20);
    }
}
