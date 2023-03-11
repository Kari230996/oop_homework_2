package Units;

import java.util.ArrayList;

public class Monk extends Unit {
    public Monk(String name) {
        super(100, 20, 10, name);
    }
    
    @Override
    public void step(ArrayList<Unit> enemies) {
        // Логика для шага монаха
    }

    public void cast() {
        System.out.println("Бум!");
    }

    @Override
    public String getInfo() {
        return this.getClass().getSimpleName();
    }
}
