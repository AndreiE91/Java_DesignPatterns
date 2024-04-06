package behavioral.interpreter;

class RetreatExpression implements ZombieExpression {
    @Override
    public void interpret(ZombieContext context) {
        System.out.println("Command: Retreat " + context.getZombiesCount() + " zombies");
    }
}
