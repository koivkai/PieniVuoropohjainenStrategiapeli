

package peli.logic; 

 
public class Duel  { 

    private Map map;
    private Player player1;
    private Player playder2;
    
    
    // tÃ¤mÃ¤ on alkuun ainoa kartta
    
    
    public Duel(Player player1, Player playder2) {
        this.map = new Map(20, 20);
        this.player1 = player1;
        this.playder2 = playder2;
        
    }

    public void buildMap() {
//        Tile tile1 = new Tile(1, 0, TileType.PLAINS);
//        this.map.addTile(tile1);
//        
//        Tile tile2 = new Tile(2, 0, TileType.PLAINS);
//        this.map.addTile(tile2);
//        
//        Tile tile3 = new Tile(3, 0, TileType.PLAINS);
//        this.map.addTile(tile3);
//        
//        Tile tile4 = new Tile(4, 0, TileType.PLAINS);
//        this.map.addTile(tile4);
//        Tile tile5 = new Tile(5, 0, TileType.PLAINS);
//        this.map.addTile(tile5);
//        
//        Tile tile6 = new Tile(6, 0, TileType.PLAINS);
//        this.map.addTile(tile6);
//        Tile tile7 = new Tile(7, 0, TileType.FOREST);
//        this.map.addTile(tile7);
//        Tile tile8 = new Tile(8, 0, TileType.MOUNTAINS);
//        this.map.addTile(tile8);
//        Tile tile9 = new Tile(9, 0, TileType.FOREST);
//        this.map.addTile(tile9);
//        Tile tile10 = new Tile(10, 0, TileType.PLAINS);
//        this.map.addTile(tile10);
//        
//        Tile tile11 = new Tile(11, 0, TileType.PLAINS);
//        this.map.addTile(tile11);
//        Tile tile12 = new Tile(12, 0, TileType.NEUTRALMINE);
//        this.map.addTile(tile12);
//        Tile tile13 = new Tile(13, 0, TileType.MOUNTAINS);
//        this.map.addTile(tile13);
//        Tile tile14 = new Tile(14, 0, TileType.NEUTRALMINE);
//        this.map.addTile(tile14);
//        Tile tile15 = new Tile(15, 0, TileType.PLAINS);
//        this.map.addTile(tile15);
        
        String mapAsString = "ppppppfmfppqmqpfffffpqppppfmfp";
        
        int x = 0;
        int y = 0;
        for (int i = 0; i < mapAsString.length(); i++) {
            if (x == this.map.getRowLength() +1) {
                y++;
                x = 0;
            }
            char a = mapAsString.charAt(i);
            TileType typeToBe = null;
            
            if (a == 'p') {
                typeToBe = TileType.PLAINS;
            }
            if (a == 'f') {
                typeToBe = TileType.FOREST;
            }
            if (a == 'm') {
                typeToBe = TileType.MOUNTAINS;
            }
            if (a == 'q') {
                typeToBe = TileType.NEUTRALMINE;
            }
            
            Tile tile = new Tile (x,y, typeToBe);
            this.map.addTile(tile);
            x++;
        }
    }

    
    public void placeBuildings() {
        
    }

    
    public void placeStartingUnits() {
        
    }

    public void setUpScenario() {
        buildMap();
    }

    public Map getMap() {
        return map;
    }
    
    

   
    
    

   

} 