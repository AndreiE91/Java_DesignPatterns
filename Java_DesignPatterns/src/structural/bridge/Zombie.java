package structural.bridge;

abstract class Zombie {
    protected ZombieType zombieType;

    public Zombie(ZombieType zombieType) {
        this.zombieType = zombieType;
    }

    abstract void performAttack();
}
