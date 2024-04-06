package structural.decorator;

abstract class ZombieDecorator implements Zombie {
    protected Zombie decoratedZombie;

    public ZombieDecorator(Zombie decoratedZombie) {
        this.decoratedZombie = decoratedZombie;
    }

    @Override
    public void attack() {
        decoratedZombie.attack();
    }
}
