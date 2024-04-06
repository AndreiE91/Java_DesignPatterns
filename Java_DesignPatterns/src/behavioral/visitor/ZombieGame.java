package behavioral.visitor;

public class ZombieGame {
    public static void main(String[] args) {
        // Create survivor
        Survivor survivor = new Survivor();

        // Create zombies
        Zombie[] zombies = {
                new BasicZombie(),
                new FastZombie(),
                new ArmoredZombie()
        };

        // Perform actions based on survivor's interaction with each zombie
        for (Zombie zombie : zombies) {
            zombie.accept(survivor);
        }
    }
}
