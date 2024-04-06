package behavioral.observer;

class Survivor implements SurvivorObserver {
    private String name;

    public Survivor(String name) {
        this.name = name;
    }

    @Override
    public void update(String location) {
        System.out.println(name + ": Zombie sighted near " + location + "! Taking evasive action...");
    }
}
