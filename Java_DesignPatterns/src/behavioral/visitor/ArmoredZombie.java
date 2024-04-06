package behavioral.visitor;

class ArmoredZombie implements Zombie {
    @Override
    public void accept(SurvivorVisitor visitor) {
        visitor.visit(this);
    }
}
