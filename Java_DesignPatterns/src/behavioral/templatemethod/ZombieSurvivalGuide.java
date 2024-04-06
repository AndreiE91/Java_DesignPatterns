package behavioral.templatemethod;

abstract class ZombieSurvivalGuide {
    // Template method
    public final void surviveZombieApocalypse() {
        barricadeWindows();
        reinforceDoors();
        scavengeForSupplies();
        if (shouldAlertZombies()) {
            alertZombies();
        }
        stayQuiet();
        fightZombies();
        escape();
    }

    // Abstract methods to be implemented by subclasses
    protected abstract void barricadeWindows();
    protected abstract void reinforceDoors();
    protected abstract void scavengeForSupplies();
    protected abstract boolean shouldAlertZombies();
    protected abstract void alertZombies();
    protected abstract void stayQuiet();
    protected abstract void fightZombies();
    protected abstract void escape();
}
