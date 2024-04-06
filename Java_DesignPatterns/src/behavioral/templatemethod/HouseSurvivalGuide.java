package behavioral.templatemethod;

class HouseSurvivalGuide extends ZombieSurvivalGuide {
    @Override
    protected void barricadeWindows() {
        System.out.println("Barricading windows with furniture and boards.");
    }

    @Override
    protected void reinforceDoors() {
        System.out.println("Reinforcing doors with additional locks and barricades.");
    }

    @Override
    protected void scavengeForSupplies() {
        System.out.println("Scavenging for food, water, and medical supplies.");
    }

    @Override
    protected boolean shouldAlertZombies() {
        // In a house, it's generally not advisable to alert zombies
        return false;
    }

    @Override
    protected void alertZombies() {
        // Do nothing
    }

    @Override
    protected void stayQuiet() {
        System.out.println("Staying quiet to avoid attracting zombies.");
    }

    @Override
    protected void fightZombies() {
        System.out.println("Fighting zombies with close combat weapons.");
    }

    @Override
    protected void escape() {
        System.out.println("Escaping through a back door or window.");
    }
}