package ru.aglophotis.patterns.strategy;

public class ApplicationRunner {
    public static void main(String[] args) {
        ApplicationRunner runner = new ApplicationRunner();
        runner.run();
    }

    private void run() {
        Context context = new Context(new SubStrategy());

        context.executeStrategy(10, 20);
        context.setStrategy(new SumStrategy());
        context.executeStrategy(10, 20);
    }
}
