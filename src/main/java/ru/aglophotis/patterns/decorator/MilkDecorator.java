package ru.aglophotis.patterns.decorator;

public class MilkDecorator extends DrinkDecorator {
    public MilkDecorator(Drink drink) {
        super(drink);
    }

    @Override
    public void printComponents() {
        super.printComponents();
        System.out.println("milk");
    }
}
