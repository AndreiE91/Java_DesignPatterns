package behavioral.chainofresponsibility;

class WeaponDefenseHandler implements ZombieDefenseHandler {
    private ZombieDefenseHandler nextHandler;

    @Override
    public void setNextHandler(ZombieDefenseHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleAttack(int zombiesCount) {
        int ammoCount = 10; // Example: Ammo count
        if (ammoCount >= zombiesCount) {
            System.out.println(zombiesCount + " zombies are shot down!");
        } else if (nextHandler != null) {
            nextHandler.handleAttack(zombiesCount);
        } else {
            System.out.println("Out of ammo! Zombies overrun!");
        }
    }
}
