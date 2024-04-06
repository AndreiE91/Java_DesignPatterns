package structural.facade;

class ZombieFacade {
    private ZombieHorde zombieHorde;
    private ZombieSpawner zombieSpawner;

    public ZombieFacade() {
        this.zombieHorde = new ZombieHorde();
        this.zombieSpawner = new ZombieSpawner();
    }

    public void startEncounter() {
        zombieHorde.summon();
        zombieSpawner.spawnZombies();
    }

    public void endEncounter() {
        zombieHorde.retreat();
        zombieSpawner.despawnZombies();
    }
}