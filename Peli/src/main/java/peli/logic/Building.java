package peli.logic;

import java.util.*;

public class Building {

    private String nimi;
    private Player player; // owner
    private ArrayList<Buildable> availableUnits;
    private int goldIncome;
    private int supply;
    private Tile tile;

    public Building(String nimi, Player player, Tile tile) {
        this.nimi = nimi;
        this.player = player;
        this.availableUnits = new ArrayList<Buildable>();
        this.tile = tile;
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

    public Tile getTile() {
        return tile;
    }

    public Player getPlayer() {
        return player;
    }

    public String getNimi() {
        return nimi;
    }

}
