package peli.logic;

import java.util.*;

public abstract class Player {

    private Army army;
    private int gold;
    private int supply;

    public Player() {
        this.gold = 0;
        this.supply = 0;
        this.army = new Army();
    }

    public abstract void pelaaVuoro();

    public Army getArmy() {
        return this.army;
    }

    public void setArmy(Army army) {
        this.army = army;
    }

    public void addUnit(Unit unit) {
        this.army.addUnit(unit);
    }
}
