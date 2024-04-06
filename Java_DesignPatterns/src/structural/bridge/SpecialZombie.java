package structural.bridge;

class SpecialZombie extends Zombie {
    public SpecialZombie(ZombieType zombieType) {
        super(zombieType);
    }

    @Override
    void performAttack() {
        System.out.print("Special ");
        zombieType.attack();
    }
}