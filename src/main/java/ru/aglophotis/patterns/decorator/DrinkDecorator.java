package ru.aglophotis.patterns.decorator;

public class DrinkDecorator implements Drink {
    private final Drink drink;

    public DrinkDecorator(Drink drink) {
        this.drink = drink;
    }

    @Override
    public void printComponents() {
        drink.printComponents();
    }
}
