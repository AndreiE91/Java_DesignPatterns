package structural.proxy;

class ZombieProxy implements Zombie {
    private String name;
    private RealZombie realZombie;

    public ZombieProxy(String name) {
        this.name = name;
    }

    @Override
    public void attack() {
        if (realZombie == null) {
            realZombie = new RealZombie(name);
        }
        realZombie.attack();
    }
}