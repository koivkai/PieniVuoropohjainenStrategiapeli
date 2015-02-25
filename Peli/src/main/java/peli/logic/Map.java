package peli.logic;

import java.util.*;

public class Map {

    private int rowLength;
    private int numberOFRows;
    private ArrayList<Tile> Tiles;

    public Map(int rowLength, int numberOfRows) {
        this.rowLength = rowLength;
        this.numberOFRows = numberOfRows;
        this.Tiles = new ArrayList<>();
    }

    public void addTile(Tile tile) {
        this.Tiles.add(tile);
    }

    public int getRowLength() {
        return rowLength;
    }

    public int getNumberOFRows() {
        return numberOFRows;
    }

    public ArrayList<Tile> getTiles() {
        return this.Tiles;
    }

}
