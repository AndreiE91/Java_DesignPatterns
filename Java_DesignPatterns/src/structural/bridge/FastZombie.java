package structural.bridge;

class FastZombie implements ZombieType {
    @Override
    public void attack() {
        System.out.println("Fast zombie attacks by running towards you!");
    }
}
