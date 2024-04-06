package creational.factorymethod;

public class NormalZombie extends Zombie{

    public NormalZombie(String name, Integer health) {
        super(name, health);
    }

    @Override
    void attack() {
        System.out.println(name + " bites you!");
    }
}
