

package peli.logic; 

 
public class Duel  { 

    private Map map;
    private Player player1;
    private Player player2;
    
    
    // tÃƒÂ¤mÃƒÂ¤ on alkuun ainoa kartta
    
    
    public Duel(Player player1, Player playder2) {
        this.map = new Map(20, 20);
        this.player1 = player1;
        this.player2 = playder2;
        
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
        
    }

    
    public void placeStartingUnits() {
        
    }

    public void setUpScenario() {
        buildMap();
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
    
    
    

   
    
    

   

} 