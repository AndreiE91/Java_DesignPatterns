package creational.prototype;

interface Zombie extends Cloneable {
    Zombie clone();
    void attack();
    void setHealth(int health);
    void setSpeed(int speed);
}
