package behavioral.strategy;

class RangedAttackStrategy implements AttackStrategy {
    @Override
    public void attack() {
        System.out.println("Survivor attacks zombies from a distance with ranged weapons!");
    }
}