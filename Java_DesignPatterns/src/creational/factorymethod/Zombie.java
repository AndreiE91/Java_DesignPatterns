package creational.factorymethod;

public  abstract class Zombie {

    String name;
    Integer health;

    public Zombie(String name, Integer health) {
        this.name = name;
        this.health = health;
    }

    abstract void attack();
}
