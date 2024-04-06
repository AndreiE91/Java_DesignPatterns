package structural.decorator;

class GunDecorator extends ZombieDecorator {
    public GunDecorator(Zombie decoratedZombie) {
        super(decoratedZombie);
    }

    @Override
    public void attack() {
        super.attack();
        shoot(); // Decorator adds additional behavior
    }

    private void shoot() {
        System.out.println("Additionally, the zombie shoots with its gun!");
    }
}
