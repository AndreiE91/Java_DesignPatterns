package creational.factoryabstract;

public class BeginnerWeaponFactory implements WeaponFactory{
    @Override
    public Weapon createMeleeWeapon() {
        return new Bat();
    }

    @Override
    public Weapon createRangedWeapon() {
        return new Pistol();
    }
}
