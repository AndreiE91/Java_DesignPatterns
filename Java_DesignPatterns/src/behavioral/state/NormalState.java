package behavioral.state;

class NormalState implements SurvivorState {
    @Override
    public void performAction(SurvivorContext context) {
        System.out.println("Survivor is calm and keeping watch.");
    }
}
