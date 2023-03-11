package Units;

import java.util.ArrayList;

public abstract class BaseHero implements UnitInterface {
    protected String name;

    public BaseHero(String name) {
        this.name = name;
    }

    @Override
    public String getInfo() {
        return this.getClass().getSimpleName();
    }

    @Override
    public abstract void step(ArrayList<Unit> enemies);
}
