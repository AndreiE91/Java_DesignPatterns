package creational.singleton;

public class ZombieGame {
    public static void main(String[] args) {
        // Get the instance of ZombieControlCenter
        ZombieControlCenter controlCenter1 = ZombieControlCenter.getInstance();
        ZombieControlCenter controlCenter2 = ZombieControlCenter.getInstance();

        // Both instances should be the same
        System.out.println("Is controlCenter1 the same instance as controlCenter2? " + (controlCenter1 == controlCenter2));

        // Use the control center to manage zombies
        controlCenter1.controlZombies();
    }
}
