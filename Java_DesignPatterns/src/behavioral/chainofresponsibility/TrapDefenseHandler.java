package behavioral.chainofresponsibility;

class TrapDefenseHandler implements ZombieDefenseHandler {
    private ZombieDefenseHandler nextHandler;

    @Override
    public void setNextHandler(ZombieDefenseHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleAttack(int zombiesCount) {
        int trapsCount = 5; // Example: Number of traps
        if (trapsCount >= zombiesCount) {
            System.out.println(zombiesCount + " zombies are trapped!");
        } else if (nextHandler != null) {
            nextHandler.handleAttack(zombiesCount);
        } else {
            System.out.println("Zombies evade the traps!");
        }
    }
}