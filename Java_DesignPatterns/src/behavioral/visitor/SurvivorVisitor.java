package behavioral.visitor;

interface SurvivorVisitor {
    void visit(BasicZombie zombie);
    void visit(FastZombie zombie);
    void visit(ArmoredZombie zombie);
}
