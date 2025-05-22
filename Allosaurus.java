package org.example;

/**
 * Jurassic land animal representing an Allosaurus.
 * Implements LandAnimal interface and returns walking behavior.
 */
public class Allosaurus implements LandAnimal {
    @Override
    public String getName() {
        return "Allosaurus";
    }

    @Override
    public String getWalking() {
        return "stomping";
    }
}
