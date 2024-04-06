package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

class ZombieTracker implements ZombieObservable {
    private List<SurvivorObserver> observers = new ArrayList<>();

    @Override
    public void addObserver(SurvivorObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(SurvivorObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String location) {
        for (SurvivorObserver observer : observers) {
            observer.update(location);
        }
    }

    public void zombieSighted(String location) {
        System.out.println("Zombie sighted at " + location + "!");
        notifyObservers(location);
    }
}
