package creational.factoryabstract;

public class Bat implements Weapon{
    @Override
    public void attack() {
        System.out.println("Swinged with the bat!");
    }
}
