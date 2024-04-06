package behavioral.memento;

public class ZombieGame {
    public static void main(String[] args) {
        Zombie zombie = new Zombie();
        ZombieCaretaker caretaker = new ZombieCaretaker();

        // Initial state
        zombie.setState(100, 0, 0);
        zombie.displayState();

        // Save state
        caretaker.saveState(zombie.saveState());

        // Simulate damage and movement
        zombie.setState(50, 10, 20);
        zombie.displayState();

        // Restore state
        zombie.restoreState(caretaker.restoreState());
        zombie.displayState();
    }
}
