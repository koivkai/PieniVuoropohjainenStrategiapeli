package peli.logic;

public class Unit {

    private int MP;
    private double Defence;
    private double Attack;
    private double HP;
    private Tile tile;
    private Player player; //owner
    String name;


    public Unit(int MP, double Defence, double Attack, double HP, Tile tile, String name) {
        this.MP = MP;
        this.Defence = Defence;
        this.Attack = Attack;
        this.HP = HP;
        this.tile = tile;
        this.name = name;
    }

    /**
 * Metodi yksiköiden hyökkäysten käsittelyyn.
 * Laskee paljonko vahinkoa kohde yksikön tulee ottaa ja laittaa sitten sen ottamaan vahingon.
 * @param   unit   Hyökkäyksen kohteena oleva yksikkö
 * 
 * 
 */
    public void Attack(Unit unit) {
        
        double damage = (1 - (unit.getDefence() + unit.getTile().getDefence())) * this.Attack;
        
        unit.TakeDamage(damage);

    }

    public void Move() {

    }
    
    /**
 * Vallottaa annetun rakennuksen yksikkön omistamalle pelaajalle.
 * 
 *
 * @param   building   vallattava rakennus
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
    
    /**
 * Tarkistaa kuoleeko yksikkö siihen kohdistuneeseen vahonkoon, jos ei kuole niin vähentä yksikön elinpisteitä.
 * 
 *
 * @param   damage   yksikköön kosdistuvan vahingon määrä
 * 
 * 
 */
    
    public void TakeDamage(double damage) {
        if (this.HP - damage <= 0) {
            this.Die();

        } else {
            this.HP = this.HP - damage;
        }
    }
    
    /**
 * Poistaa yksikön armeijasta ja täten pelistä.
 * */
    public void Die() {
        this.player.getArmy().removeUnit(this);

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
    
    
    
    

}
