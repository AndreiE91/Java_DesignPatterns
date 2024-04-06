package behavioral.chainofresponsibility;

public class ZombieGame {
    public static void main(String[] args) {
        // Create the chain of responsibility
        ZombieDefenseHandler barricadeHandler = new BarricadeDefenseHandler();
        ZombieDefenseHandler trapHandler = new TrapDefenseHandler();
        ZombieDefenseHandler weaponHandler = new WeaponDefenseHandler();

        barricadeHandler.setNextHandler(trapHandler);
        trapHandler.setNextHandler(weaponHandler);

        // Simulate zombie attacks
        System.out.println("Zombie attack!");
        barricadeHandler.handleAttack(4); // Zombies are blocked by barricades.
        barricadeHandler.handleAttack(6); // Zombies overrun the barricades!
        barricadeHandler.handleAttack(3); // Zombies are trapped!
        barricadeHandler.handleAttack(8); // Zombies are shot down!
        barricadeHandler.handleAttack(12); // Out of ammo! Zombies overrun!
    }
}
