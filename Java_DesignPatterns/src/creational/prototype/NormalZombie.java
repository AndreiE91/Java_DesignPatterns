package creational.prototype;

class NormalZombie implements Zombie {
    private int health;
    private int speed;

    public NormalZombie() {
        // Default values
        health = 100;
        speed = 1;
    }

    @Override
    public Zombie clone() {
        try {
            return (NormalZombie) super.clone();
        } catch (CloneNotSupportedException e) {
            return null; // Should not happen
        }
    }

    @Override
    public void attack() {
        System.out.println("Normal zombie attacks by biting!");
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
        return "Normal Zombie [Health: " + health + ", Speed: " + speed + "]";
    }
}
