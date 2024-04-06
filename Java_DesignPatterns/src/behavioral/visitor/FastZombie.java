package behavioral.visitor;

class FastZombie implements Zombie {
    @Override
    public void accept(SurvivorVisitor visitor) {
        visitor.visit(this);
    }
}
