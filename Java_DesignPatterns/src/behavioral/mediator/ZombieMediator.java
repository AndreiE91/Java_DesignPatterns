package behavioral.mediator;

interface ZombieMediator {
    void notifySurvivors(String message);
    void notifyBarricades(String message);
    void notifyWeapons(String message);
}
