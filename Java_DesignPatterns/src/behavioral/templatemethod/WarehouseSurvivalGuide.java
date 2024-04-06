package behavioral.templatemethod;

class WarehouseSurvivalGuide extends ZombieSurvivalGuide {
    @Override
    protected void barricadeWindows() {
        System.out.println("Barricading windows with heavy crates and pallets.");
    }

    @Override
    protected void reinforceDoors() {
        System.out.println("Reinforcing doors with metal plates and welding.");
    }

    @Override
    protected void scavengeForSupplies() {
        System.out.println("Scavenging for weapons, ammunition, and emergency supplies.");
    }

    @Override
    protected boolean shouldAlertZombies() {
        // In a warehouse, it may be necessary to alert zombies to divert their attention
        return true;
    }

    @Override
    protected void alertZombies() {
        System.out.println("Using loud noises or distractions to draw zombies away from the main entrance.");
    }

    @Override
    protected void stayQuiet() {
        System.out.println("Moving quietly within the warehouse to avoid detection.");
    }

    @Override
    protected void fightZombies() {
        System.out.println("Fighting zombies with firearms and improvised weapons.");
    }

    @Override
    protected void escape() {
        System.out.println("Finding a vehicle or alternate exit to escape the area.");
    }
}
