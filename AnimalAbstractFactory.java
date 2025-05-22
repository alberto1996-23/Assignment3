package org.example;

import java.util.List;

/**
 * Abstract factory interface for producing animals based on historical eras.
 * Provides methods to create land, sea, and sky animals for a specific era.
 */
public interface AnimalAbstractFactory {
    String getEra();
    List<LandAnimal> createLandAnimals();
    List<SeaAnimal> createSeaAnimals();
    List<SkyAnimal> createSkyAnimals();
}
