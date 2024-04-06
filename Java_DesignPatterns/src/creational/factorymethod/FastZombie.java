package creational.factorymethod;

public class FastZombie extends Zombie{

    public FastZombie(String name, Integer health) {
        super(name, health);
    }

    @Override
    void attack() {
        System.out.println(name + " runs towards you!");
    }
}
