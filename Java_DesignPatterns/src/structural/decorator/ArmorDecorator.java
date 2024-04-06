package structural.decorator;

class ArmorDecorator extends ZombieDecorator {
    public ArmorDecorator(Zombie decoratedZombie) {
        super(decoratedZombie);
    }

    @Override
    public void attack() {
        super.attack();
        defend(); // Decorator adds additional behavior
    }

    private void defend() {
        System.out.println("Additionally, the zombie has armored protection!");
    }
}
