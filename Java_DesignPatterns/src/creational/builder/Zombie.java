package creational.builder;

public class Zombie {

    private String name;
    private Integer health;
    private Double speed;
    private RunMode runMode;
    private Double damage;

    public Zombie() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHealth() {
        return health;
    }

    public void setHealth(Integer health) {
        this.health = health;
    }

    public Double getSpeed() {
        return speed;
    }

    public void setSpeed(Double speed) {
        this.speed = speed;
    }

    public RunMode getRunMode() {
        return runMode;
    }

    public void setRunMode(RunMode runMode) {
        this.runMode = runMode;
    }

    public Double getDamage() {
        return damage;
    }

    public void setDamage(Double damage) {
        this.damage = damage;
    }

    @Override
    public String toString() {
        return "Zombie{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", speed=" + speed +
                ", runMode=" + runMode +
                ", damage=" + damage +
                '}';
    }
}
