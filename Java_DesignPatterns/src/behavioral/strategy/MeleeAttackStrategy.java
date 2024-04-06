package behavioral.strategy;

class MeleeAttackStrategy implements AttackStrategy {
    @Override
    public void attack() {
        System.out.println("Survivor engages in melee combat with the zombies!");
    }
}
