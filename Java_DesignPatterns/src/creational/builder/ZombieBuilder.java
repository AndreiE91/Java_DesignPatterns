package creational.builder;

public class ZombieBuilder implements Builder{

    Zombie zombie;
    @Override
    public void reset() {
        this.zombie = new Zombie();
    }

    @Override
    public void setName(String name) {
        zombie.setName(name);
    }

    @Override
    public void setHealth(Integer health) {
        zombie.setHealth(health);
    }

    @Override
    public void setSpeed(Double speed) {
        zombie.setSpeed(speed);
    }

    @Override
    public void setRunMode(RunMode mode) {
        zombie.setRunMode(mode);
    }

    @Override
    public void setDamage(Double damage) {
        zombie.setDamage(damage);
    }

    public Zombie getResult() {
        return zombie;
    }
}
