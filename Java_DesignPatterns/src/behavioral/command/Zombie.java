package behavioral.command;

class Zombie {
    public void attack() {
        System.out.println("Zombie attacks by biting!");
    }

    public void retreat() {
        System.out.println("Zombie retreats!");
    }

    public void barricade() {
        System.out.println("Zombie tries to break through barricade!");
    }
}