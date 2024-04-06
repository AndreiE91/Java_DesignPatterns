package structural.bridge;

class RegularZombie extends Zombie {
    public RegularZombie(ZombieType zombieType) {
        super(zombieType);
    }

    @Override
    void performAttack() {
        System.out.print("Regular ");
        zombieType.attack();
    }
}