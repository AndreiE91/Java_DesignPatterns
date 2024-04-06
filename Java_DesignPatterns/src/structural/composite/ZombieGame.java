package structural.composite;

public class ZombieGame {
    public static void main(String[] args) {
        // Create basic zombies
        Zombie basicZombie1 = new BasicZombie("Zombie 1");
        Zombie basicZombie2 = new BasicZombie("Zombie 2");
        Zombie basicZombie3 = new BasicZombie("Zombie 3");

        // Create a group of zombies
        ZombieGroup zombieGroup = new ZombieGroup();
        zombieGroup.addZombie(basicZombie1);
        zombieGroup.addZombie(basicZombie2);
        zombieGroup.addZombie(basicZombie3);

        // Create more basic zombies
        Zombie basicZombie4 = new BasicZombie("Zombie 4");
        Zombie basicZombie5 = new BasicZombie("Zombie 5");

        // Create another group of zombies
        ZombieGroup zombieGroup2 = new ZombieGroup();
        zombieGroup2.addZombie(basicZombie4);
        zombieGroup2.addZombie(basicZombie5);
        zombieGroup2.addZombie(zombieGroup); // Add a group to another group

        // Attack
        System.out.println("First group attacking:");
        zombieGroup.attack();

        System.out.println("\nSecond group attacking:");
        zombieGroup2.attack();
    }
}
