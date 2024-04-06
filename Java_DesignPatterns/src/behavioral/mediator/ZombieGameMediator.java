package behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

class ZombieGameMediator implements ZombieMediator {
    private List<Survivor> survivors = new ArrayList<>();
    private List<Barricade> barricades = new ArrayList<>();
    private List<Weapon> weapons = new ArrayList<>();

    public void addSurvivor(Survivor survivor) {
        survivors.add(survivor);
    }

    public void addBarricade(Barricade barricade) {
        barricades.add(barricade);
    }

    public void addWeapon(Weapon weapon) {
        weapons.add(weapon);
    }

    @Override
    public void notifySurvivors(String message) {
        for (Survivor survivor : survivors) {
            survivor.receiveMessage(message);
        }
    }

    @Override
    public void notifyBarricades(String message) {
        for (Barricade barricade : barricades) {
            barricade.receiveMessage(message);
        }
    }

    @Override
    public void notifyWeapons(String message) {
        for (Weapon weapon : weapons) {
            weapon.receiveMessage(message);
        }
    }
}