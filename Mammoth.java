package org.example;

/**
 * Cenozoic land animal representing a Mammoth.
 * Implements LandAnimal interface and returns walking behavior.
 */
public class Mammoth implements LandAnimal {
    @Override
    public String getName() {
        return "Mammoth";
    }

    @Override
    public String getWalking() {
        return "stomping";
    }
}

