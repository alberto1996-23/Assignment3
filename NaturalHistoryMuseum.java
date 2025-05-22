package org.example;

import java.util.List;

/**
 * Client class demonstrating use of the Abstract Factory pattern.
 * Displays land, sea, and sky animals for different historical eras.
 */
public class NaturalHistoryMuseum {

    public static void main(String[] args) {
        AnimalAbstractFactory[] factories = {
                new CenozoicAnimalFactory(),
                new JurassicAnimalFactory(),
                new TriassicAnimalFactory()
        };

        for (AnimalAbstractFactory factory : factories) {
            System.out.println();
            System.out.println("You are in the " + factory.getEra() + " exhibition");

            System.out.println("===== " + factory.getEra() + " land animals section =====");
            List<LandAnimal> landAnimals = factory.createLandAnimals();
            for (LandAnimal a : landAnimals) {
                System.out.println("A " + a.getName() + " " + a.getWalking());
            }

            System.out.println("===== " + factory.getEra() + " sea animals section =====");
            List<SeaAnimal> seaAnimals = factory.createSeaAnimals();
            for (SeaAnimal a : seaAnimals) {
                System.out.println("A " + a.getName() + " " + a.getSwimming());
            }

            System.out.println("===== " + factory.getEra() + " sky animals section =====");
            List<SkyAnimal> skyAnimals = factory.createSkyAnimals();
            for (SkyAnimal a : skyAnimals) {
                System.out.println("A " + a.getName() + " " + a.getFlying());
            }

            System.out.println("Thank you for visiting the " + factory.getEra() + " exhibition");
        }
    }
}
