package org.example;

/**
 * Cenozoic sky animal representing an Argentavis.
 * Implements SkyAnimal interface and returns flying behavior.
 */
public class Argentavis implements SkyAnimal {
    @Override
    public String getName() {
        return "Argentavis";
    }

    @Override
    public String getFlying() {
        return "flapping";
    }
}
