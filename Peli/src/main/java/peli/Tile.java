/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peli;

/**
 *
 * @author Kaius
 */
public class Tile {

    private int x;
    private int y;
    private int movement;
    private double defence;
    private TileType type;

    public Tile(int x, int y, TileType t) {
        this.x = x;
        this.y = y;
        if (t.equals(TileType.PLAINS)) {
            this.movement = 1;
            this.defence = 0;
        } else if (t.equals(TileType.HILLS)) {
            this.movement = 1;
            this.defence = 0.1;

        }
    }

    public double getDefence() {
        return defence;
    }

    public int getMovement() {
        return movement;
    }

}
