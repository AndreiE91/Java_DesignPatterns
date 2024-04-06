package structural.decorator;

public class ZombieGame {
    public static void main(String[] args) {
        // Create a basic zombie
        Zombie basicZombie = new BasicZombie();

        // Decorate the basic zombie with gun and armor
        Zombie gunZombie = new GunDecorator(basicZombie);
        Zombie armoredGunZombie = new ArmorDecorator(gunZombie);

        // Attack behavior
        System.out.println("Basic zombie attacks:");
        basicZombie.attack();

        System.out.println("\nGun zombie attacks:");
        gunZombie.attack();

        System.out.println("\nArmored gun zombie attacks:");
        armoredGunZombie.attack();
    }
}
