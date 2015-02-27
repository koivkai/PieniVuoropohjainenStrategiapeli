package peli.logic;

/**
 * Luokka kuvaa pelin yksiköitä, joita käytetään vastustajan yksiköiden
 * tuhoamiseen ja rakennusten valtaukseen.
 */
public class Unit {

    private int MP; //MovementPoints
    private double Defence;
    private double Attack;
    private double HP;
    private Tile tile;
    private Player player; //owner
    private boolean hasMoved;
    private boolean hasAttacked;
    private String name;

    public Unit(int MP, double Defence, double Attack, double HP, Tile tile, String name, Player player) {
        this.MP = MP;
        this.Defence = Defence;
        this.Attack = Attack;
        this.HP = HP;
        this.tile = tile;
        this.name = name;
        this.hasAttacked = false;
        this.hasMoved = false;
        this.player = player;
    }

    /**
     * Metodi yksiköiden hyökkäysten käsittelyyn. Laskee paljonko vahinkoa kohde
     * yksikön tulee ottaa ja laittaa sitten sen ottamaan vahingon tai
     * kuolemaan.
     *
     * @param unit Hyökkäyksen kohteena oleva yksikkö
     *
     *
     */
    public void attack(Unit unit) {

        double damage = (1 - (unit.getDefence() + unit.getTile().getDefence())) * this.Attack;

        if (unit.HP - damage <= 0) {
            Army army = unit.getPlayer().getArmy();
            army.removeUnit(unit);

        } else {
            unit.HP = unit.HP - damage;
        }

    }

    public double getDefence() {
        return Defence;
    }

    public Tile getTile() {
        return tile;
    }

    public double getHP() {
        return HP;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public String getName() {
        return name;
    }

    public void setTile(Tile tile) {
        this.tile = tile;
    }

    public Player getPlayer() {
        return player;
    }

    public int getMP() {
        return MP;
    }

    public void setHasAttacked(boolean hasAttacked) {
        this.hasAttacked = hasAttacked;
    }

    public void setHasMoved(boolean hasMoved) {
        this.hasMoved = hasMoved;
    }

    public boolean getHasMoved() {
        return this.hasMoved;
    }

    public boolean getHasAttacked() {
        return this.hasAttacked;
    }

    public double getAttack() {
        return Attack;
    }

}
