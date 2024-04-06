package behavioral.observer;

public class ZombieGame {
    public static void main(String[] args) {
        ZombieTracker tracker = new ZombieTracker();

        Survivor survivor1 = new Survivor("Alice");
        Survivor survivor2 = new Survivor("Bob");
        Survivor survivor3 = new Survivor("Charlie");

        tracker.addObserver(survivor1);
        tracker.addObserver(survivor2);
        tracker.addObserver(survivor3);

        // Simulate zombie sighting
        tracker.zombieSighted("House");
    }
}