package peli.logic;

public class Tile {

    private int x;
    private int y;
    private int movement;
    private double defence;
    private TileType type;
    private Building building;
    private int uiX;
    private int uiY;

    public Tile(int x, int y, TileType type, Building building) {
        this.x = x;
        this.y = y;

        this.type = type;
        this.building = building;
    }

    public Tile(int x, int y, TileType t) {
        this.x = x;
        this.y = y;
        if (t.equals(TileType.PLAINS)) {
            this.movement = 1;
            this.defence = 0;
        } else if (t.equals(TileType.HILLS)) {
            this.movement = 1;
            this.defence = 0.1;

        } else if (t.equals(TileType.FOREST)) {
            this.movement = 2;
            this.defence = 0.2;

        } else if (t.equals(TileType.MOUNTAINS)) {
            this.movement = 3;
            this.defence = 0.3;

        }  else {
            this.movement = 1;
            this.defence = 0.3;
        }
        this.type = t;
    }

    public double getDefence() {
        return defence;
    }

    public int getMovement() {
        return movement;
    }

    public TileType getType() {
        return type;
    }

    public void setUiX(int uiX) {
        this.uiX = uiX;
    }

    public void setUiY(int uiY) {
        this.uiY = uiY;
    }

    public int getUiX() {
        return uiX;
    }

    public int getUiY() {
        return uiY;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

}
