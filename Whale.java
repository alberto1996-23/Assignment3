package org.example;

/**
 * Cenozoic sea animal representing a Whale.
 * Implements SeaAnimal interface and returns swimming behavior.
 */
public class Whale implements SeaAnimal {
    @Override
    public String getName() {
        return "Whale";
    }

    @Override
    public String getSwimming() {
        return "splashing";
    }
}
