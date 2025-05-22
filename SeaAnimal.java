package org.example;

/**
 * Interface for sea animals in the museum.
 * Extends Animal and requires a swimming behavior description.
 */
public interface SeaAnimal extends Animal {
    String getSwimming();
}
