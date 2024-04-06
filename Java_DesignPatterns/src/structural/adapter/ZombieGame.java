package structural.adapter;

public class ZombieGame {
    public static void main(String[] args) {
        // Creating a GunZombie
        GunZombie gunZombie = new GunZombie();

        // Creating a Weapon adapter for the GunZombie
        Weapon weapon = new ZombieAdapter(gunZombie);

        // Using the Weapon adapter
        weapon.use(); // This will call the shoot method of GunZombie
    }
}
