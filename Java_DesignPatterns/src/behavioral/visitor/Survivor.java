package behavioral.visitor;

class Survivor implements SurvivorVisitor {
    @Override
    public void visit(BasicZombie zombie) {
        System.out.println("Survivor attacks basic zombie!");
    }

    @Override
    public void visit(FastZombie zombie) {
        System.out.println("Survivor tries to avoid fast zombie!");
    }

    @Override
    public void visit(ArmoredZombie zombie) {
        System.out.println("Survivor negotiates with armored zombie!");
    }
}