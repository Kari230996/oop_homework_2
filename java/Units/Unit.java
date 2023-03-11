package Units;

import java.util.ArrayList;

public abstract class Unit implements UnitInterface {
    protected float hp;
    protected int speed;
    protected int damage;
    protected final String NAME;

    public Unit(float hp, int speed, int damage, String name) {
        this.hp = hp;
        this.speed = speed;
        this.damage = damage;
        NAME = name;
    }

    @Override
    public void step(ArrayList<Unit> enemies) {
        System.out.println("Шаг.");
    }
}
