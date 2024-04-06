package creational.builder;

public class Client {
    public static void main(String[] args) {
        Director director = new Director();

        ZombieBuilder builder = new ZombieBuilder();
        director.buildAverageZombie(builder);
        Zombie zombie = builder.getResult();

        BestiaryEntryBuilder builderBestiary = new BestiaryEntryBuilder();
        director.buildAverageZombie(builderBestiary);
        BestiaryEntry bestiaryEntry = builderBestiary.getResult();

        System.out.println(zombie.toString());
        System.out.println(bestiaryEntry.toString());
    }
}
