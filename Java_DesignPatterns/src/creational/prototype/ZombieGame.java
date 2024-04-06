package creational.prototype;

public class ZombieGame {
    public static void main(String[] args) {
        // Creating initial zombie prototypes
        NormalZombie normalZombiePrototype = new NormalZombie();
        FastZombie fastZombiePrototype = new FastZombie();

        // Cloning prototypes and customizing properties
        NormalZombie zombie1 = (NormalZombie) normalZombiePrototype.clone();
        zombie1.setHealth(120); // Customizing health for zombie1
        FastZombie zombie2 = (FastZombie) fastZombiePrototype.clone();
        zombie2.setSpeed(3); // Customizing speed for zombie2

        // Output the properties of cloned zombies
        System.out.println("Zombie 1: " + zombie1);
        System.out.println("Zombie 2: " + zombie2);

        // Zombies attack
        zombie1.attack();
        zombie2.attack();
    }
}
