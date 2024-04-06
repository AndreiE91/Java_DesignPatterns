package behavioral.mediator;

class ZombieSurvivor implements Survivor {
    private ZombieMediator mediator;

    public ZombieSurvivor(ZombieMediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void sendMessage(String message) {
        mediator.notifySurvivors(message);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println("Survivor receives message: " + message);
    }
}
