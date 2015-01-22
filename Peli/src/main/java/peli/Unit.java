

package peli; 

 
public class Unit {
    
    private int MP;
    private double Defence;
    private double Attack;
    private double HP;
    private Tile tile;
    String name;

    public Unit(int MP, double Defence, double Attack, double HP, Tile tile, String name) {
        this.MP = MP;
        this.Defence = Defence;
        this.Attack = Attack;
        this.HP = HP;
        this.tile = tile;
        this.name = name;
    }
    
    
    
    public void Attack(Unit unit) {
        double effectiveDef = unit.getDefence() + unit.getTile().getDefence();
        double damage = (1 - effectiveDef) * this.Attack;
        unit.TakeDamage(damage);
        
    }
    public void Move() {
        
    }
    
    public void Capture() {
    
}

    public double getDefence() {
        return Defence;
    }

    public Tile getTile() {
        return tile;
    }
    
    public void TakeDamage(double damage) {
        if (this.HP - damage <= 0) {
            this.Die();
            
        }
        else {
            this.HP= this.HP - damage;
        }
    }
    
    public void Die() {
        
    }
    
     
    
    
   

} 