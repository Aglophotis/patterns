package ru.aglophotis.patterns.builder;

public class ApplicationRunner {
    public static void main(String[] args) {
        ApplicationRunner runner = new ApplicationRunner();
        runner.run();
    }

    private void run() {
        CoffeeBuilder coffeeBuilder = new CoffeeBuilder();
        TeaBuilder teaBuilder = new TeaBuilder();

        coffeeBuilder.setSugar(4);
        teaBuilder.setVolume(500);

        coffeeBuilder.getResult().printProperties();
        teaBuilder.getResult().printProperties();
    }
}
