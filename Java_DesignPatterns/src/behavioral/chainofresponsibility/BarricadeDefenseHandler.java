package behavioral.chainofresponsibility;

class BarricadeDefenseHandler implements ZombieDefenseHandler {
    private ZombieDefenseHandler nextHandler;
    private int barricadeStrength = 3; // Example: Barricade strength

    @Override
    public void setNextHandler(ZombieDefenseHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleAttack(int zombiesCount) {
        if (barricadeStrength >= zombiesCount) {
            System.out.println(zombiesCount + " zombies are blocked by barricades.");
        } else if (nextHandler != null) {
            nextHandler.handleAttack(zombiesCount);
        } else {
            System.out.println("Zombies overrun the barricades!");
        }
    }
}
