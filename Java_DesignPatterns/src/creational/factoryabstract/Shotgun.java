package creational.factoryabstract;

public class Shotgun implements Weapon{

    @Override
    public void attack() {
        System.out.println("Fired the shotgun!");
    }
}
