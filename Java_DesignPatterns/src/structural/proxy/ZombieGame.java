package structural.proxy;

public class ZombieGame {
    public static void main(String[] args) {
        // Create a zombie proxy
        System.out.println("Calling create code for Zombie 1");
        Zombie zombie = new ZombieProxy("Zombie 1");
        System.out.println("Code for creating Zombie 1 finished execution");

        // Attack
        zombie.attack();

        // Attack again (this time, the real zombie is already created)
        zombie.attack();
    }
}
