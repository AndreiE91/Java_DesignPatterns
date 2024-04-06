package behavioral.memento;

class ZombieMemento {
    private int health;
    private int positionX;
    private int positionY;

    public ZombieMemento(int health, int positionX, int positionY) {
        this.health = health;
        this.positionX = positionX;
        this.positionY = positionY;
    }

    public int getHealth() {
        return health;
    }

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }
}
