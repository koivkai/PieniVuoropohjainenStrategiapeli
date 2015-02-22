package peli.logic;

import java.util.*;

public abstract class Player {

    private Army army;
    private int resources;

    public Player() {
        this.resources = 0;
        this.army = new Army();
    }
    
    
    
    public abstract void pelaaVuoro();
    
    public Army getArmy() {
        return this.army;
    }
    
    public void setArmy(Army army) {
        this.army = army;
    }
}

