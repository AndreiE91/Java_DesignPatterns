package behavioral.state;

class SurvivorContext {
    private SurvivorState state;

    public SurvivorContext() {
        // Initial state is Normal
        this.state = new NormalState();
    }

    public void setState(SurvivorState state) {
        this.state = state;
    }

    public void performAction() {
        state.performAction(this);
    }
}
