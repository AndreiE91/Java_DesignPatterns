package structural.bridge;

public class ZombieGame {
    public static void main(String[] args) {
        // Create different types of zombies
        Zombie regularZombie = new RegularZombie(new NormalZombie());
        Zombie fastZombie = new SpecialZombie(new FastZombie());

        // Perform attacks
        regularZombie.performAttack(); // Regular zombie attacks by biting!
        fastZombie.performAttack();    // Special zombie attacks by running towards you!
    }
}
