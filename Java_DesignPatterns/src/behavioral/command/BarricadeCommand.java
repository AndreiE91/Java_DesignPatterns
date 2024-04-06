package behavioral.command;

class BarricadeCommand implements ZombieCommand {
    private Zombie zombie;

    public BarricadeCommand(Zombie zombie) {
        this.zombie = zombie;
    }

    @Override
    public void execute() {
        zombie.barricade();
    }
}
