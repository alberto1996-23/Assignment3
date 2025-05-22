package org.example;

/**
 * Jurassic sky animal representing a Pterodactylus.
 * Implements SkyAnimal interface and returns flying behavior.
 */
public class Pterodactylus implements SkyAnimal {
    public String getName() {
        return "Pterodactylus";
    }

    @Override
    public String getFlying() {
        return "flapping";
    }
}
