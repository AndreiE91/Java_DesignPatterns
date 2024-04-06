package structural.composite;

class BasicZombie implements Zombie {
    private String name;

    public BasicZombie(String name) {
        this.name = name;
    }

    @Override
    public void attack() {
        System.out.println("Basic zombie " + name + " attacks by biting!");
    }
}
