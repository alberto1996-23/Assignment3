package org.example;

import java.util.Arrays;
import java.util.List;

/**
 * Concrete factory for creating Jurassic-era animals.
 * Implements creation methods for land, sea, and sky animals.
 */
public class JurassicAnimalFactory implements AnimalAbstractFactory {
    @Override
    public String getEra() {
        return "Jurassic";
    }

    @Override
    public List<LandAnimal> createLandAnimals() {
        return Arrays.asList(new Allosaurus());
    }

    @Override
    public List<SeaAnimal> createSeaAnimals() {
        return Arrays.asList(new Plesiosaurus());
    }

    @Override
    public List<SkyAnimal> createSkyAnimals() {
        return Arrays.asList(new Pterodactylus());
    }
}
