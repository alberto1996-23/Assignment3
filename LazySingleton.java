package org.example;

/**
 * Singleton class that lazily creates up to three instances on demand.
 * Instances are accessed by index using getInstance(int).
 */
public class LazySingleton {
    // Step 1: Array to store up to 3 instances
    private static final LazySingleton[] instances = new LazySingleton[3];

    // Step 2: ID to track which instance this is
    private final int id;

    // Step 3: Private constructor to prevent external instantiation
    private LazySingleton(int id) {
        this.id = id;
        System.out.println("LazySingleton " + id + " instantiated");
    }

    // Step 4: Public method to access or create the singleton at index
    public static LazySingleton getInstance(int index) {
        if (index < 0 || index >= 3) {
            throw new IllegalArgumentException("Index must be between 0 and 2");
        }

        if (instances[index] == null) {
            instances[index] = new LazySingleton(index);
        }

        return instances[index];
    }

    // Step 5: Used by the client to identify which instance was retrieved
    public int getId() {
        return id;
    }
}

