package behavioral.state;

class PanicState implements SurvivorState {
    @Override
    public void performAction(SurvivorContext context) {
        System.out.println("Survivor is panicking and running away from zombies!");
    }
}
