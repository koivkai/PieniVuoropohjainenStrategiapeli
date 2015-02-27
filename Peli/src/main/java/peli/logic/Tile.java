package peli.logic;

/**
 * Luokka kuvaa tiiliä, joista pelin kartta koostuu. Movement arvo on tehty
 * laajennusta varten kunnollista reitin hakua ajatellen. X ja y kertovat palan
 * sijainnin logiikassa, uiX ja uiY kertovat todellisen sijainnin näytöllä. UI
 * arvot lisättiin hätärakaisuna deadlinien painaessa päälle.
 */
public class Tile {

    private int x;
    private int y;
    private int movement; // näitä ei tällähetkellä käytetä mihinkään.
    private double defence;
    private TileType type;
    private int uiX;
    private int uiY;

    /**
     * Metodi luo uuden tiilen. Tiilen defence ja movement(eikäytössä) riippuva
     * tiilentyypistä.
     *
     * @param x
     * @param y
     * @param t
     */
    public Tile(int x, int y, TileType t) {
        this.x = x;
        this.y = y;
        if (t.equals(TileType.PLAINS)) {
            this.movement = 1;
            this.defence = 0.1;
        } else if (t.equals(TileType.HILLS)) { // näitä ei ole pelissä käytössä vielä yhtään.
            this.movement = 1;
            this.defence = 0.1;

        } else if (t.equals(TileType.FOREST)) {
            this.movement = 2;
            this.defence = 0.2;

        } else if (t.equals(TileType.MOUNTAINS)) {
            this.movement = 3;
            this.defence = 0.3;

        } else if (t.equals(TileType.ROADDOWNTOLEFT) || t.equals(TileType.ROADDOWNTORIGHT) || t.equals(TileType.ROADHORIZONTAL) || t.equals(TileType.ROADUPLEFTDOWN) || t.equals(TileType.ROADUPRIGHTDOWN) || t.equals(TileType.ROADUPTOLEFT) || t.equals(TileType.ROADUPTORIGHT) || t.equals(TileType.ROADVERTICAL)) {
            this.movement = 4;
            this.defence = 0;

        } else {
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
