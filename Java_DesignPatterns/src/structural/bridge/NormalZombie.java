package structural.bridge;

class NormalZombie implements ZombieType {
    @Override
    public void attack() {
        System.out.println("Normal zombie attacks by biting!");
    }
}
