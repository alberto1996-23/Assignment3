package org.example;

import java.util.Arrays;
import java.util.List;

/**
 * Concrete factory for creating Triassic-era animals.
 * Implements creation methods for land, sea, and sky animals.
 */
public class TriassicAnimalFactory implements AnimalAbstractFactory {
    @Override
    public String getEra() {
        return "Triassic";
    }

    @Override
    public List<LandAnimal> createLandAnimals() {
        return Arrays.asList(new Coelophysis());
    }

    @Override
    public List<SeaAnimal> createSeaAnimals() {
        return Arrays.asList(new Nothosaurus());
    }

    @Override
    public List<SkyAnimal> createSkyAnimals() {
        return Arrays.asList(new Eudimorphodon());
    }
}