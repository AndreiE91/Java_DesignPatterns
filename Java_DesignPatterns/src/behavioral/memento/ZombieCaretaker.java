package behavioral.memento;

class ZombieCaretaker {
    private ZombieMemento memento;

    public void saveState(ZombieMemento memento) {
        this.memento = memento;
    }

    public ZombieMemento restoreState() {
        return memento;
    }
}
