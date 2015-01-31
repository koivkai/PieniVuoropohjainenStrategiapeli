package peli.logic;

import java.util.*;

public class Army {

    private ArrayList<Unit> units;

    public Army() {
        this.units = new ArrayList<>();
    }

    public void addUnit(Unit unit) {
        this.units.add(unit);
    }

    public void removeUnit(Unit unit) {
        this.units.remove(unit);
    }

}
