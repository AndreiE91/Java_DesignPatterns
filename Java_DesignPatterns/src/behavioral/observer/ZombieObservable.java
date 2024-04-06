package behavioral.observer;

interface ZombieObservable {
    void addObserver(SurvivorObserver observer);
    void removeObserver(SurvivorObserver observer);
    void notifyObservers(String location);
}
