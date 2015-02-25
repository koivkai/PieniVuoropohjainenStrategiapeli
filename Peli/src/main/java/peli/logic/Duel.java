

package peli.logic; 

 
public class Duel  { 

    private Map map;
    private Player player1;
    private Player player2;
    private Unit selectedUnit;
    private Tile selectedTile;
    private Building selectedBuilding;
    private BuildingList buildings;
    private Player playerWhoseTurnItIs;
    
    // tÃƒÂ¤mÃƒÂ¤ on alkuun ainoa kartta
    
    
    public Duel(Player player1, Player playder2) {
        this.map = new Map(20, 20);
        this.player1 = player1;
        this.player2 = playder2;
        this.selectedTile = null;
        this.selectedUnit = null;
        this.buildings = new BuildingList();
        this.playerWhoseTurnItIs = player1;
        
    }

    public void buildMap() {

        
        String mapAsString = "ppppppfmfppqmqpfffffpqppppfmfppafappqmqppmzmqpfmfppprppppppppa1pppfmfppz1zppapappp32222222224pfppppppp1ppppppppp1pffffpmpf1ppfffffpp322225pmpf1apfqmqf627pppf1pmpf1ppfffff1pppppf1pmpp1ppppppq1pfffff1pmmp1fffffp1qpppppp1ppmp1fppppp1fffffpp1fpmp1fppp627fqmqfpa1fpmp822224ppfffffpp1fpmpffffp1ppppppppp1pppppppfp32222222224pppapappz1zppfmfppp1appppppppbpppfmfpqmzmppqmqppafappfmfppppqpfffffpqmqppfmfpppppp";
        
        int x = 0;
        int y = 0;
        for (int i = 0; i < mapAsString.length(); i++) {
            if (x == this.map.getRowLength() +1) {
                y++;
                x = 0;
            }
            char tileTypeID = mapAsString.charAt(i);
            TileType typeToBe = null;
            
            if (tileTypeID == 'p') {
                typeToBe = TileType.PLAINS;
            }
            if (tileTypeID == 'f') {
                typeToBe = TileType.FOREST;
            }
            if (tileTypeID == 'm') {
                typeToBe = TileType.MOUNTAINS;
            }
            if (tileTypeID == 'q') {
                typeToBe = TileType.MINENEUTRAL;
            }
            if (tileTypeID == 'a') {
                typeToBe = TileType.FARMNEUTRAL;
            }
            if (tileTypeID == 'z') {
                typeToBe = TileType.OUTPOSTNEUTRAL;
            }
            if (tileTypeID == 'r') {
                typeToBe = TileType.REDHQ;
            }
            if (tileTypeID == '1') {
                typeToBe = TileType.ROADVERTICAL;
            }
            if (tileTypeID == '2') {
                typeToBe = TileType.ROADHORIZONTAL;
            }
            if (tileTypeID == '3') {
                typeToBe = TileType.ROADUPRIGHTDOWN;
            }
            if (tileTypeID == '4') {
                typeToBe = TileType.ROADUPLEFTDOWN;
            }
            if (tileTypeID == '5') {
                typeToBe = TileType.ROADDOWNTOLEFT;
            }
            if (tileTypeID == '6') {
                typeToBe = TileType.ROADDOWNTORIGHT;
            }
            if (tileTypeID == '7') {
                typeToBe = TileType.ROADUPTOLEFT;
            }
            if (tileTypeID == '8') {
                typeToBe = TileType.ROADUPTORIGHT;
            }
            if (tileTypeID == 'b') {
                typeToBe = TileType.BLUEHQ;
            }
            
            
            Tile tile = new Tile (x,y, typeToBe);
            this.map.addTile(tile);
            x++;
        }
    }

    
    public void placeBuildings() {
        
        Building building1 = new Building ("Mine", player2, map.getTiles().get(11));
        this.buildings.addBuilding(building1);
        
        Building building2 = new Building ("Mine", player2, map.getTiles().get(13));
        this.buildings.addBuilding(building2);
        
        Building building3 = new Building ("Mine", null, map.getTiles().get(21));
        this.buildings.addBuilding(building3);
        
        Building building4 = new Building ("Farm", player2, map.getTiles().get(31));
        this.buildings.addBuilding(building4); 
        
        Building building5 = new Building ("Farm", player2, map.getTiles().get(33));
        this.buildings.addBuilding(building5);
        
        Building building6 = new Building ("Farm", null, map.getTiles().get(36));
        this.buildings.addBuilding(building6);
        
        Building building7 = new Building ("Farm", null, map.getTiles().get(38));
        this.buildings.addBuilding(building7);
        
        Building building8 = new Building ("Outpost", null, map.getTiles().get(42));
        this.buildings.addBuilding(building8);
        
        Building building9 = new Building ("Mine", null, map.getTiles().get(44));
        this.buildings.addBuilding(building9);
        
        Building building10 = new Building ("HQ", player2, map.getTiles().get(52));
        this.buildings.addBuilding(building10);
        
        Building building11 = new Building ("Farm", null, map.getTiles().get(61));
        this.buildings.addBuilding(building11);
        
        
        
        
        
    }

    
    public void placeStartingUnits() {
        
    }

    public void setUpScenario() {
        buildMap();
        placeBuildings();
    }

    public Map getMap() {
        return map;
    }

    public Player getPlayer1() {
        return player1;
    }

    public Player getPlayer2() {
        return player2;
    }

    public void setSelectedTile(Tile selectedTile) {
        this.selectedTile = selectedTile;
    }

    public void setSelectedUnit(Unit selectedUnit) {
        this.selectedUnit = selectedUnit;
    }

    public Tile getSelectedTile() {
        return selectedTile;
    }

    public Unit getSelectedUnit() {
        return selectedUnit;
    }

    public BuildingList getBuildings() {
        return buildings;
    }

    public Building getSelectedBuilding() {
        return selectedBuilding;
    }

    public void setSelectedBuilding(Building selectedBuilding) {
        this.selectedBuilding = selectedBuilding;
    }

    public Player getPlayerWhoseTurnItIs() {
        return playerWhoseTurnItIs;
    }

    public void setPlayerWhoseTurnItIs(Player playerWhoseTurnItIs) {
        this.playerWhoseTurnItIs = playerWhoseTurnItIs;
    }
    
    
    
    

   
    
    

   

} 