

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
        Tile tile1 = new Tile(1, 0, TileType.PLAINS);
        this.map.addTile(tile1);
        
        Tile tile2 = new Tile(2, 0, TileType.PLAINS);
        this.map.addTile(tile2);
        
        Tile tile3 = new Tile(3, 0, TileType.PLAINS);
        this.map.addTile(tile3);
        
        Tile tile4 = new Tile(4, 0, TileType.PLAINS);
        this.map.addTile(tile4);
        
        Tile tile5 = new Tile(5, 0, TileType.PLAINS);
        this.map.addTile(tile5);
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