package org.example;

/**
 * Singleton class that eagerly creates three instances at program startup.
 * Instances are accessed by index using getInstance(int).
 */
public class EagerSingleton {
    // Step 1: Static array to hold all 3 singleton instances
    private static final EagerSingleton[] instances = new EagerSingleton[3];

    // Step 2: Static block to eagerly instantiate all 3 at class loading
    static {
        for (int i = 0; i < 3; i++) {
            instances[i] = new EagerSingleton(i);
            System.out.println("EagerSingleton " + i + " instantiated");
        }
    }

    // Step 3: ID field to help track the instance
    private final int id;

    // Step 4: Private constructor to prevent external instantiation
    private EagerSingleton(int id) {
        this.id = id;
    }

    // Step 5: Public method to retrieve the instance by index (0–2)
    public static EagerSingleton getInstance(int index) {
        if (index < 0 || index >= 3) {
            throw new IllegalArgumentException("Index must be between 0 and 2");
        }
        return instances[index];
    }

    // Step 6: Return the ID of the instance (used by client for logging)
    public int getId() {
        return id;
    }
}
