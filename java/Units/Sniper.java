package Units;

import java.util.ArrayList;


public class Sniper extends Unit{
    public Sniper(String name) {
        super(100, 76, 21, name);
    }

    @Override
    public void step(ArrayList<Unit> enemies) {
        System.out.println("Снайпер высрелил!");
    }
    
    @Override
    public String getInfo() {
        return this.getClass().getSimpleName();
    }
}