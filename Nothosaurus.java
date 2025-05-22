package org.example;

/**
 * Triassic sea animal representing a Nothosaurus.
 * Implements SeaAnimal interface and returns swimming behavior.
 */
public class Nothosaurus implements SeaAnimal {
    @Override
    public String getName() {
        return "Nothosaurus";
    }

    @Override
    public String getSwimming() {
        return "splashing";
    }
}
