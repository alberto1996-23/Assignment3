package org.example;

/**
 * Triassic sky animal representing an Eudimorphodon.
 * Implements SkyAnimal interface and returns flying behavior.
 */
public class Eudimorphodon implements SkyAnimal {
    public String getName() {
        return "Eudimorphodon";
    }

    @Override
    public String getFlying() {
        return "flapping";
    }
}
