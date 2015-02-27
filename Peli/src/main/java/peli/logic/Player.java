package peli.logic;

import java.util.*;

/**
 * Luokka on abstracti luokka pelaajille. Tehty siinä toivossa että peliin
 * tulisi vielä joskus AI.
 */
public abstract class Player {

    private Army army;
    private int gold; //ei käytössä
    private int supply; // ei käytössä

    public Player() {
        this.gold = 0;
        this.supply = 0;
        this.army = new Army();
    }

    /**
     * Metodin tarkoitus on mahdollistaa tietokonepelaajat.
     *
     *
     */
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
