package behavioral.memento;

class Zombie {
    private int health;
    private int positionX;
    private int positionY;

    public void setState(int health, int positionX, int positionY) {
        this.health = health;
        this.positionX = positionX;
        this.positionY = positionY;
    }

    public ZombieMemento saveState() {
        return new ZombieMemento(health, positionX, positionY);
    }

    public void restoreState(ZombieMemento memento) {
        this.health = memento.getHealth();
        this.positionX = memento.getPositionX();
        this.positionY = memento.getPositionY();
    }

    public void displayState() {
        System.out.println("Zombie state - Health: " + health + ", Position: (" + positionX + ", " + positionY + ")");
    }
}
