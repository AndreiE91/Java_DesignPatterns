package creational.factoryabstract;

public class Axe implements Weapon{
    @Override
    public void attack() {
        System.out.println("Attacked with the axe!");
    }
}
