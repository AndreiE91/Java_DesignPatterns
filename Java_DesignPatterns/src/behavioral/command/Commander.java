package behavioral.command;

class Commander {
    private ZombieCommand command;

    public void setCommand(ZombieCommand command) {
        this.command = command;
    }

    public void executeCommand() {
        command.execute();
    }
}
