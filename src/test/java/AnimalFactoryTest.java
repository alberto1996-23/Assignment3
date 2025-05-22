import org.example.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

/**
 * Unit test to verify that all animal factories return properly initialized animals.
 * This covers land, sea, and sky animals from the Cenozoic, Jurassic, and Triassic eras.
 */
public class AnimalFactoryTest {

    private void testFactory(AnimalAbstractFactory factory) {
        assertNotNull(factory.getEra(), "Era should not be null");

        List<LandAnimal> landAnimals = factory.createLandAnimals();
        assertFalse(landAnimals.isEmpty(), factory.getEra() + " should have land animals");
        for (LandAnimal animal : landAnimals) {
            assertNotNull(animal.getName(), factory.getEra() + " land animal name is null");
            assertNotNull(animal.getWalking(), factory.getEra() + " land animal walking behavior is null");
        }

        List<SeaAnimal> seaAnimals = factory.createSeaAnimals();
        assertFalse(seaAnimals.isEmpty(), factory.getEra() + " should have sea animals");
        for (SeaAnimal animal : seaAnimals) {
            assertNotNull(animal.getName(), factory.getEra() + " sea animal name is null");
            assertNotNull(animal.getSwimming(), factory.getEra() + " sea animal swimming behavior is null");
        }

        List<SkyAnimal> skyAnimals = factory.createSkyAnimals();
        assertFalse(skyAnimals.isEmpty(), factory.getEra() + " should have sky animals");
        for (SkyAnimal animal : skyAnimals) {
            assertNotNull(animal.getName(), factory.getEra() + " sky animal name is null");
            assertNotNull(animal.getFlying(), factory.getEra() + " sky animal flying behavior is null");
        }
    }

    @Test
    public void testCenozoicFactory() {
        testFactory(new CenozoicAnimalFactory());
    }

    @Test
    public void testJurassicFactory() {
        testFactory(new JurassicAnimalFactory());
    }

    @Test
    public void testTriassicFactory() {
        testFactory(new TriassicAnimalFactory());
    }
}
