

package peli.ui; 

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import peli.logic.Building;
import peli.logic.Duel;
import peli.logic.Tile;
import peli.logic.Unit;

 
public class CaptureListener implements ActionListener {
    
    private Duel duel;
    private Component component;

    public CaptureListener(Duel duel, Component component) {
        this.duel = duel;
        this.component = component;
    }

    
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (this.duel.getSelectedUnit() != null) {
            Unit unit = this.duel.getSelectedUnit();
            Tile tile = unit.getTile();
            
            for (Building building: this.duel.getBuildings().getBuildings()) {
                if (building.getTile() == unit.getTile()) {
                    building.setPlayer(this.duel.getPlayerWhoseTurnItIs());
                }
            }
        }
        System.out.println("Capture!");
        this.component.repaint();
    }

   

} 