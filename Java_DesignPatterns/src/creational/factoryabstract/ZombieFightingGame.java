package creational.factoryabstract;

public class ZombieFightingGame {
    public static void main(String[] args) {
        // Beginner player
        WeaponFactory beginnerFactory = new BeginnerWeaponFactory();
        Weapon beginnerMeleeWeapon = beginnerFactory.createMeleeWeapon();
        Weapon beginnerRangedWeapon = beginnerFactory.createRangedWeapon();

        System.out.println("Beginner player attacking zombies:");
        beginnerMeleeWeapon.attack();
        beginnerRangedWeapon.attack();

        System.out.println();

        // Advanced player
        WeaponFactory advancedFactory = new AdvancedWeaponFactory();
        Weapon advancedMeleeWeapon = advancedFactory.createMeleeWeapon();
        Weapon advancedRangedWeapon = advancedFactory.createRangedWeapon();

        System.out.println("Advanced player attacking zombies:");
        advancedMeleeWeapon.attack();
        advancedRangedWeapon.attack();
    }
}
