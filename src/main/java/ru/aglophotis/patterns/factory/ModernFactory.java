package ru.aglophotis.patterns.factory;

public class ModernFactory implements FurnitureFactory {

    @Override
    public Chair createChair() {
        return new ModernChair();
    }
}
