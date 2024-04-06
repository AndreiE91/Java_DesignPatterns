package behavioral.iterator;

import java.util.Iterator;

public class ZombieGame {
    public static void main(String[] args) {
        // Create a zombie horde
        ZombieHorde horde = new ZombieHorde();
        horde.addZombie(new Zombie("Zombie 1"));
        horde.addZombie(new Zombie("Zombie 2"));
        horde.addZombie(new Zombie("Zombie 3"));

        // Iterate over the zombie horde
        Iterator<Zombie> iterator = horde.createIterator();
        while (iterator.hasNext()) {
            Zombie zombie = iterator.next();
            System.out.println("Encountered: " + zombie.getName());
        }
    }
}