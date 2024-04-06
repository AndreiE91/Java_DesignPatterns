package behavioral.command;

class RetreatCommand implements ZombieCommand {
    private Zombie zombie;

    public RetreatCommand(Zombie zombie) {
        this.zombie = zombie;
    }

    @Override
    public void execute() {
        zombie.retreat();
    }
}
