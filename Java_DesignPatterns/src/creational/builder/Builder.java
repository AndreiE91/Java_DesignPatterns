package creational.builder;

public interface Builder {

    void reset();
    void setName(String name);
    void setHealth(Integer health);
    void setSpeed(Double speed);
    void setRunMode(RunMode mode);
    void setDamage(Double damage);
}
