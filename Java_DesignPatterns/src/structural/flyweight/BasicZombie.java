package structural.flyweight;

class BasicZombie implements Zombie {
    private String type;

    public BasicZombie(String type) {
        this.type = type;
    }

    @Override
    public void attack() {
        System.out.println(type + " zombie attacks by biting!");
    }
}
