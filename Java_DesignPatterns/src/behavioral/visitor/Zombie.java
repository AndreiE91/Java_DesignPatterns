package behavioral.visitor;

interface Zombie {
    void accept(SurvivorVisitor visitor);
}
