package creational.prototype;

class FastZombie implements Zombie {
    private int health;
    private int speed;

    public FastZombie() {
        // Default values
        health = 80;
        speed = 2;
    }

    @Override
    public Zombie clone() {
        try {
            return (FastZombie) super.clone();
        } catch (CloneNotSupportedException e) {
            return null; // Should not happen
        }
    }

    @Override
    public void attack() {
        System.out.println("Fast zombie attacks by running towards you!");
    }

    @Override
    public void setHealth(int health) {
        this.health = health;
    }

    @Override
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Fast Zombie [Health: " + health + ", Speed: " + speed + "]";
    }
}
