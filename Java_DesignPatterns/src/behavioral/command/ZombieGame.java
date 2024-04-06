package behavioral.command;

public class ZombieGame {
    public static void main(String[] args) {
        // Create a zombie
        Zombie zombie = new Zombie();

        // Create commands
        ZombieCommand attackCommand = new AttackCommand(zombie);
        ZombieCommand retreatCommand = new RetreatCommand(zombie);
        ZombieCommand barricadeCommand = new BarricadeCommand(zombie);

        // Create invoker
        Commander commander = new Commander();

        // Issue commands
        commander.setCommand(attackCommand);
        commander.executeCommand();

        commander.setCommand(retreatCommand);
        commander.executeCommand();

        commander.setCommand(barricadeCommand);
        commander.executeCommand();
    }
}
