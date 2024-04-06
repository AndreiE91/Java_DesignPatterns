package creational.builder;

public class BestiaryEntryBuilder implements Builder{

    BestiaryEntry entry;
    @Override
    public void reset() {
        this.entry = new BestiaryEntry();
    }

    @Override
    public void setName(String name) {
        entry.setName(name);
    }

    @Override
    public void setHealth(Integer health) {
        entry.setHealth(health);
    }

    @Override
    public void setSpeed(Double speed) {
        entry.setSpeed(speed);
    }

    @Override
    public void setRunMode(RunMode mode) {
        entry.setRunMode(mode);
    }

    @Override
    public void setDamage(Double damage) {
        entry.setDamage(damage);
    }

    public BestiaryEntry getResult() {
        return entry;
    }
}
