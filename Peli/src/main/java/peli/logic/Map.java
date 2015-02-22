

package peli.logic; 

import java.util.ArrayList;

 
public class Map { 

   private int rowLength;
   private int numberOFRows;
   private ArrayList<Tile> Tiles;

    public Map(int rowLength, int numberOfRows) {
        this.rowLength = rowLength;
        this.numberOFRows = numberOfRows;
        this.Tiles = new ArrayList<Tile>();
    }
    
    public void addTile(Tile tile) {
        this.Tiles.add(tile);
    }

    public int getRowLength() {
        return rowLength;
    }

    public int getNumberOFRows() {
        return numberOFRows;
    }

    public ArrayList<Tile> getTiles() {
        return Tiles;
    }
    
    
    
    
    
    
   
   
   

} 