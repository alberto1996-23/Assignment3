package org.example;

/**
 * Triassic land animal representing a Coelophysis.
 * Implements LandAnimal interface and returns walking behavior.
 */
public class Coelophysis implements LandAnimal {
    @Override
    public String getName() {
        return "Coelophysis";
    }

    @Override
    public String getWalking() {
        return "stomping";
    }
}
