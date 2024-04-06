package behavioral.state;

class AlertState implements SurvivorState {
    @Override
    public void performAction(SurvivorContext context) {
        System.out.println("Survivor is on high alert, ready to react to any threat!");
    }
}
