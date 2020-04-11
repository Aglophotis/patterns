package ru.aglophotis.patterns.decorator;

public class Coffee implements Drink {

    @Override
    public void printComponents() {
        System.out.println("coffee");
    }
}
