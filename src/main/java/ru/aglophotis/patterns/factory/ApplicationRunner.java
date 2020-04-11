package ru.aglophotis.patterns.factory;

public class ApplicationRunner {
    public static void main(String[] args) {
        ApplicationRunner runner = new ApplicationRunner();
        runner.run();
    }

    private void run() {
        FurnitureFactory modernFactory = new ModernFactory();
        FurnitureFactory gothicFactory = new GothicFactory();

        checkChairType(modernFactory);
        checkChairType(gothicFactory);
    }

    private void checkChairType(FurnitureFactory furnitureFactory) {
        System.out.println(furnitureFactory.createChair().getChairType());
    }
}
