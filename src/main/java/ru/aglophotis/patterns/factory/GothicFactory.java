package ru.aglophotis.patterns.factory;

public class GothicFactory implements FurnitureFactory {

    @Override
    public Chair createChair() {
        return new GothicChair();
    }
}
