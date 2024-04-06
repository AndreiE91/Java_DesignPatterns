package behavioral.strategy;

public class ZombieGame {
    public static void main(String[] args) {
        Survivor survivor = new Survivor();

        // Choose Melee Attack Strategy
        survivor.setAttackStrategy(new MeleeAttackStrategy());
        survivor.performAttack();

        // Choose Ranged Attack Strategy
        survivor.setAttackStrategy(new RangedAttackStrategy());
        survivor.performAttack();
    }
}
