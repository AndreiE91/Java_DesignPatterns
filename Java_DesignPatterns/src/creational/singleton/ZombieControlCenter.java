package creational.singleton;

class ZombieControlCenter {
    private static ZombieControlCenter instance;

    // Private constructor to prevent instantiation from outside
    private ZombieControlCenter() {
        // Initialization code if needed
    }

    // Method to get the instance of ZombieControlCenter
    public static ZombieControlCenter getInstance() {
        if (instance == null) {
            instance = new ZombieControlCenter();
        }
        return instance;
    }

    // Method to control the behavior of all zombies
    public void controlZombies() {
        System.out.println("Zombie control center is coordinating the actions of all zombies.");
        // Add logic to control zombies here
    }
}
