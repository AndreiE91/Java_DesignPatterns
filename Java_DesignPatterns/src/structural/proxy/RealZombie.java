package structural.proxy;

class RealZombie implements Zombie {
    private String name;

    public RealZombie(String name) {
        this.name = name;
        System.out.println("Real zombie " + name + " is created.");
    }

    @Override
    public void attack() {
        System.out.println("Real zombie " + name + " attacks by biting!");
    }
}
