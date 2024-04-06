package behavioral.visitor;

class BasicZombie implements Zombie {
    @Override
    public void accept(SurvivorVisitor visitor) {
        visitor.visit(this);
    }
}
