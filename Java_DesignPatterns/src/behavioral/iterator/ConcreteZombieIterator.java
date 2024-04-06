package behavioral.iterator;

import java.util.List;

class ConcreteZombieIterator implements ZombieIterator {
    private List<Zombie> zombies;
    private int position = 0;

    public ConcreteZombieIterator(List<Zombie> zombies) {
        this.zombies = zombies;
    }

    @Override
    public boolean hasNext() {
        return position < zombies.size();
    }

    @Override
    public Zombie next() {
        if (hasNext()) {
            return zombies.get(position++);
        }
        throw new IndexOutOfBoundsException("No more zombies in the horde.");
    }
}