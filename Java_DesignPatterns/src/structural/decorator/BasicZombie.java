package structural.decorator;

class BasicZombie implements Zombie {
    @Override
    public void attack() {
        System.out.println("Basic zombie attacks by biting!");
    }
}
