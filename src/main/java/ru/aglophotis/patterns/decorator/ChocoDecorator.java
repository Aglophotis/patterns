package ru.aglophotis.patterns.decorator;

public class ChocoDecorator extends DrinkDecorator {
    public ChocoDecorator(Drink drink) {
        super(drink);
    }

    @Override
    public void printComponents() {
        super.printComponents();
        System.out.println("choco");
    }
}
