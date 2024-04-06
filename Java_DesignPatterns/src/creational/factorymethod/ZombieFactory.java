package creational.factorymethod;

public class ZombieFactory {
    public static Zombie createZombie(String type, String name, Integer health) throws IllegalAccessException {
        return switch (type) {
            case "Normal" -> new NormalZombie(name, health);
            case "Fast" -> new FastZombie(name, health);
            // Add more cases for other types of zombies
            default -> throw new IllegalAccessException("Invalid zombie type: " + type);
        };
    }
}
