package behavioral.mediator;

class Weapon {
    private ZombieMediator mediator;

    public Weapon(ZombieMediator mediator) {
        this.mediator = mediator;
    }

    public void weaponBroken() {
        mediator.notifyWeapons("Weapon broken!");
    }

    public void receiveMessage(String message) {
        System.out.println("Weapon receives message: " + message);
    }
}
