package structural.composite;

import java.util.ArrayList;
import java.util.List;

class ZombieGroup implements Zombie {
    private List<Zombie> zombies = new ArrayList<>();

    public void addZombie(Zombie zombie) {
        zombies.add(zombie);
    }

    public void removeZombie(Zombie zombie) {
        zombies.remove(zombie);
    }

    @Override
    public void attack() {
        System.out.println("Group of zombies attacks together:");
        for (Zombie zombie : zombies) {
            zombie.attack();
        }
    }
}