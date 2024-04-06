package behavioral.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class ZombieHorde implements ZombieCollection {
    private List<Zombie> zombies = new ArrayList<>();

    public void addZombie(Zombie zombie) {
        zombies.add(zombie);
    }

    @Override
    public Iterator<Zombie> createIterator() {
        return new ConcreteZombieIterator(zombies);
    }
}
