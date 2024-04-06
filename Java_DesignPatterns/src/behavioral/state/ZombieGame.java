package behavioral.state;

public class ZombieGame {
    public static void main(String[] args) {
        SurvivorContext survivor = new SurvivorContext();

        // Initial state: Normal
        survivor.performAction();

        // Change state to Alert
        survivor.setState(new AlertState());
        survivor.performAction();

        // Change state to Panic
        survivor.setState(new PanicState());
        survivor.performAction();
    }
}
