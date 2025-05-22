package org.example;

/**
 * Jurassic sea animal representing a Plesiosaurus.
 * Implements SeaAnimal interface and returns swimming behavior.
 */
public class Plesiosaurus implements SeaAnimal {
    @Override
    public String getName() {
        return "Plesiosaurus";
    }

    @Override
    public String getSwimming() {
        return "splashing";
    }
}
