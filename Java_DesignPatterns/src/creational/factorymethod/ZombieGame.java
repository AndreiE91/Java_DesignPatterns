package creational.factorymethod;

public class ZombieGame {
    public static void main(String[] args) throws IllegalAccessException {

        Zombie normalZombie = ZombieFactory.createZombie("Normal", "Walker", 100);
        Zombie fastZombie = ZombieFactory.createZombie("Fast", "Runner", 80);

        normalZombie.attack();
        fastZombie.attack();
    }
}
