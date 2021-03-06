package peli.logic;

import java.util.*;

/**
 * Luokka kuvaa rakennus. Gold ja supply oli tarkoitettu resursseiksi, mutta
 * niitä ei aika rajoitusten takia ole pelissä mukana.
 */
public class Building {

    private String nimi;
    private Player player; // owner
    private ArrayList<Buildable> availableUnits;
    private int goldIncome;
    private int supply;
    private Tile tile;
    private boolean hasBuild;

    /**
     * Building konstructori. Huomaa automaattinen uusi arrayList ja hasBuild
     * muuttujan default arvo (false)
     *
     *
     * @param nimi
     * @param player
     * @param tile
     */
    public Building(String nimi, Player player, Tile tile) {
        this.nimi = nimi;
        this.player = player;
        this.availableUnits = new ArrayList<Buildable>();
        this.tile = tile;
        this.hasBuild = false;
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

    public void setHasBuild(boolean hasBuild) {
        this.hasBuild = hasBuild;
    }

    public boolean getHasBuild() {
        return this.hasBuild;
    }

}
