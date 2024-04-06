package behavioral.templatemethod;

public class ZombieGame {
    public static void main(String[] args) {
        System.out.println("Surviving the zombie apocalypse in a house:");
        ZombieSurvivalGuide houseGuide = new HouseSurvivalGuide();
        houseGuide.surviveZombieApocalypse();

        System.out.println("\nSurviving the zombie apocalypse in a warehouse:");
        ZombieSurvivalGuide warehouseGuide = new WarehouseSurvivalGuide();
        warehouseGuide.surviveZombieApocalypse();
    }
}
