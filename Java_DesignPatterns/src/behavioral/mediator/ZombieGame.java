package behavioral.mediator;

public class ZombieGame {
    public static void main(String[] args) {
        ZombieGameMediator mediator = new ZombieGameMediator();

        ZombieSurvivor survivor1 = new ZombieSurvivor(mediator);
        ZombieSurvivor survivor2 = new ZombieSurvivor(mediator);

        Barricade barricade = new Barricade(mediator);
        Weapon weapon = new Weapon(mediator);

        mediator.addSurvivor(survivor1);
        mediator.addSurvivor(survivor2);
        mediator.addBarricade(barricade);
        mediator.addWeapon(weapon);

        // Simulate events
        barricade.barricadeDestroyed();
        weapon.weaponBroken();
    }
}
