package Units;

import java.util.ArrayList;

public class XBowMan extends Unit {
    public XBowMan(String name) {
        super(100, 10, 20, name);
    }

    @Override
    public void step(ArrayList<Unit> enemies) {
        // Логика для шага лучника
    }

    public void shoot() {
        System.out.println("Пиф-паф!");
    }

    @Override
    public String getInfo() {
        return this.getClass().getSimpleName() + " " + NAME;
    }
}

