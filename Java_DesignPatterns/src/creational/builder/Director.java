package creational.builder;

public class Director {
    public void buildWeakZombie(Builder builder) {
        builder.reset();
        builder.setName("Weak Zombie");
        builder.setHealth(50);
        builder.setDamage(10.0);
        builder.setSpeed(1.0);
        builder.setRunMode(RunMode.WALK);
    }

    public void buildAverageZombie(Builder builder) {
        builder.reset();
        builder.setName("Average Zombie");
        builder.setHealth(100);
        builder.setDamage(20.0);
        builder.setSpeed(1.5);
        builder.setRunMode(RunMode.JOG);
    }

    public void buildStrongZombie(Builder builder) {
        builder.reset();
        builder.setName("Strong Zombie");
        builder.setHealth(250);
        builder.setDamage(50.0);
        builder.setSpeed(2.0);
        builder.setRunMode(RunMode.SPRINT);
    }
}
