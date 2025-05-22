package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Random;

/**
 * Client class to test the behavior of EagerSingleton and LazySingleton.
 * Runs both singleton types with 2-second delays to observe instantiation patterns.
 */
public class Assignment3Singleton {
    public static void main(String[] args) {
        Random r = new Random();

        for (int i = 0; i < 10; i++) {
            EagerSingleton s = EagerSingleton.getInstance(r.nextInt(3));
            System.out.println("Retrieved eager singleton " + s.getId());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {}
        }

        for (int i = 0; i < 10; i++) {
            LazySingleton s = LazySingleton.getInstance(r.nextInt(3));
            System.out.println("Retrieved lazy singleton " + s.getId());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {}
        }
    }
}
