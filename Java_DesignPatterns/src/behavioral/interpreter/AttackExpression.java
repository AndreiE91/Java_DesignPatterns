package behavioral.interpreter;

class AttackExpression implements ZombieExpression {
    @Override
    public void interpret(ZombieContext context) {
        System.out.println("Command: Attack " + context.getZombiesCount() + " zombies");
    }
}