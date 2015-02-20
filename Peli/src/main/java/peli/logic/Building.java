package peli.logic;

import java.util.*;

public class Building {

    private int x;
    private int y;
    private String nimi;
    private Player player; // owner
    private ArrayList<Buildable> availableUnits;
    private int goldIncome;
    private int supply;

    public Building(int x, int y, String nimi, Player player) {
        this.x = x;
        this.y = y;
        this.nimi = nimi;
        this.player = player;
        this.availableUnits = new ArrayList<Buildable>();
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public int getGoldIncome() {
        return goldIncome;
    }

    public int getSupply() {
        return supply;
    }
    
    

}
