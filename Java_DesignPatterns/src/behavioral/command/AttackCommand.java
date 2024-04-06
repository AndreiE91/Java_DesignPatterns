package behavioral.command;

class AttackCommand implements ZombieCommand {
    private Zombie zombie;

    public AttackCommand(Zombie zombie) {
        this.zombie = zombie;
    }

    @Override
    public void execute() {
        zombie.attack();
    }
}
