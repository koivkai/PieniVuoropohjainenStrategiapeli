package peli.logic;

public class Unit {

    private int MP;
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
    public void Attack(Unit unit) {

        double damage = (1 - (unit.getDefence() + unit.getTile().getDefence())) * this.Attack;

        if (unit.HP - damage <= 0) {
            Army army = unit.getPlayer().getArmy();
            army.removeUnit(unit);

        } else {
            unit.HP = unit.HP - damage;
        }

    }

    public void Move() {

    }

    /**
     * Vallottaa annetun rakennuksen yksikkön omistamalle pelaajalle.
     *
     *
     * @param building vallattava rakennus
     *
     * @return todennäköisyys kalibroituna
     */
    public void Capture(Building building) {
        building.setPlayer(this.player);
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

}
