package structural.adapter;

class ZombieAdapter implements Weapon {
    private GunZombie gunZombie;

    public ZombieAdapter(GunZombie gunZombie) {
        this.gunZombie = gunZombie;
    }

    @Override
    public void use() {
        gunZombie.shoot(); // Call the shoot method of GunZombie
    }
}
