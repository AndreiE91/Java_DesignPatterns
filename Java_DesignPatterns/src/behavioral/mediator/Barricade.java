package behavioral.mediator;

class Barricade {
    private ZombieMediator mediator;

    public Barricade(ZombieMediator mediator) {
        this.mediator = mediator;
    }

    public void barricadeDestroyed() {
        mediator.notifyBarricades("Barricade destroyed!");
    }

    public void receiveMessage(String message) {
        System.out.println("Barricade receives message: " + message);
    }
}