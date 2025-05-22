package org.example;

/**
 * Interface for land animals in the museum.
 * Extends Animal and requires a walking behavior description.
 */
public interface LandAnimal extends Animal {
    String getWalking();
}
