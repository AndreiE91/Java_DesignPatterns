package structural.flyweight;

public class ZombieGame {
    public static void main(String[] args) {
        // Create different types of zombies
        Zombie regularZombie = ZombieFactory.getZombie("Regular");
        Zombie fastZombie = ZombieFactory.getZombie("Fast");
        Zombie armoredZombie = ZombieFactory.getZombie("Armored");

        // Use the zombies
        regularZombie.attack();
        fastZombie.attack();
        armoredZombie.attack();

        // Demonstrate that regular zombie is shared
        Zombie regularZombie2 = ZombieFactory.getZombie("Regular");
        System.out.println("Is regularZombie the same instance as regularZombie2? " + (regularZombie == regularZombie2));
    }
}
