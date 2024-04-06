package structural.flyweight;

import java.util.HashMap;
import java.util.Map;

class ZombieFactory {
    private static Map<String, Zombie> zombies = new HashMap<>();

    public static Zombie getZombie(String type) {
        Zombie zombie = zombies.get(type);

        if (zombie == null) {
            zombie = new BasicZombie(type);
            zombies.put(type, zombie);
        }

        return zombie;
    }
}
