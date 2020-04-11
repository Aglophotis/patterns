package ru.aglophotis.patterns.decorator;

public class ApplicationRunner {
    public static void main(String[] args) {
        ApplicationRunner runner = new ApplicationRunner();
        runner.run();
    }

    private void run() {
        Drink coffee = new Coffee();
        coffee = new MilkDecorator(coffee);
        coffee = new ChocoDecorator(coffee);
        coffee = new ChocoDecorator(coffee);

        coffee.printComponents();
    }

}
