

package peli.logic; 

 
public class Duel implements Scenario { 

    private Map map;
    private Player player1;
    private Player playder2;
    
    
    // tämä on alkuun ainoa kartta
    
    
    public Duel(Player player1, Player playder2) {
        this.map = new Map(20, 20);
        this.player1 = player1;
        this.playder2 = playder2;
        
    }

    public void buildMap() {
    }

    
    public void placeBuildings() {
        
    }

    
    public void placeStartingUnits() {
        
    }

    @Override
    public void setUpScenario() {
        buildMap();
    }

   

} 