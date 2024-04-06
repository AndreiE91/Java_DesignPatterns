package creational.factoryabstract;

public class Pistol implements Weapon{
    @Override
    public void attack() {
        System.out.println("Shooting with the pistol!");
    }
}
