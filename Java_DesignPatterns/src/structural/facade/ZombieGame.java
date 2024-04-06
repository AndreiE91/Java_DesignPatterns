package structural.facade;

public class ZombieGame {
    public static void main(String[] args) {
        // Create a facade for managing zombie encounters
        ZombieFacade zombieFacade = new ZombieFacade();

        // Start and end zombie encounter
        System.out.println("Starting zombie encounter:");
        zombieFacade.startEncounter();

        System.out.println("\nEnding zombie encounter:");
        zombieFacade.endEncounter();
    }
}
