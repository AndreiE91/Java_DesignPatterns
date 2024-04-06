package behavioral.interpreter;

public class ZombieGame {
    public static void main(String[] args) {
        // Define a command to attack and retreat a group of zombies
        ZombieExpression attackExpression = new AttackExpression();
        ZombieExpression retreatExpression = new RetreatExpression();

        // Combine attack and retreat commands
        ZombieExpression command = new CompositeExpression(attackExpression, retreatExpression);

        // Interpret the commands
        ZombieContext context = new ZombieContext(5); // 5 zombies in the group
        command.interpret(context);
    }
}
