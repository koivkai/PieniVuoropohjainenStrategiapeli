package peli.logic;

import java.util.*;

/**
 * Luokka kuvaa pelin karttaa. Kartta koostuu tiilistä. rowLengtht kertoo kuinka
 * monta tiiltä kuhunkin riviin kuluu ja number of row kuinka monta niitä rivejä
 * on. Ainoalla pelissä olevalla kartalla molemmat arvot ovat 20.
 */
public class Map {

    private int rowLength;
    private int numberOFRows;
    private ArrayList<Tile> Tiles;

    /**
     * Metodi kertoo mikä on onnistumistodennäköisyys syöteluvulla ottaen
     * huomioon olion konstruktorissa asetetun kalibrointiarvon
     *
     *
     * @param rowLength montako tiiltä per rivi
     * @param numberOfRows montako riviä tiiliä
     */
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
