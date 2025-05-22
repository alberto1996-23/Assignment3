package org.example;

import java.util.Arrays;
import java.util.List;

/**
 * Concrete factory for creating Cenozoic-era animals.
 * Implements creation methods for land, sea, and sky animals.
 */
public class CenozoicAnimalFactory implements AnimalAbstractFactory {

    @Override
    public String getEra() {
        return "Cenozoic";
    }

    @Override
    public List<LandAnimal> createLandAnimals() {
        return Arrays.asList(new Mammoth());
    }

    @Override
    public List<SeaAnimal> createSeaAnimals() {
        return Arrays.asList(new Whale());
    }

    @Override
    public List<SkyAnimal> createSkyAnimals() {
        return Arrays.asList(new Argentavis());
    }
}

