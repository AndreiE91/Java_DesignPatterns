package creational.factoryabstract;

public class AdvancedWeaponFactory implements WeaponFactory{
    @Override
    public Weapon createMeleeWeapon() {
        return new Axe();
    }

    @Override
    public Weapon createRangedWeapon() {
        return new Shotgun();
    }
}
