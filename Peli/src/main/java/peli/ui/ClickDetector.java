package peli.ui;

import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import peli.logic.Army;
import peli.logic.Building;
import peli.logic.Duel;
import peli.logic.Tile;
import peli.logic.Unit;

public class ClickDetector implements MouseListener {

    private Duel duel;
    private Component component;

    public ClickDetector(Duel duel, Component component) {
        this.duel = duel;
        this.component = component;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        System.out.println(x);
        System.out.println(y);

        Unit selectedUnit = null;
        Tile selectedTile = null;

        Army army = null;

        if (this.duel.getPlayerWhoseTurnItIs() == this.duel.getPlayer1()) {
            army = this.duel.getPlayer1().getArmy();
        } else {
            army = this.duel.getPlayer2().getArmy();
        }

        if (this.duel.getSelectedUnit() == null) {
            for (Unit unit : army.getUnits()) {
                Tile unitsTile = unit.getTile();
                if (unitsTile.getUiX() <= x && unitsTile.getUiX() + 39 >= x && unitsTile.getUiY() + 25 <= y && unitsTile.getUiY() + 65 >= y) {
                    selectedUnit = unit;
                    this.duel.setSelectedUnit(unit);
                    this.duel.setSelectedTile(null);
                    this.duel.setSelectedBuilding(null);
                    
                    System.out.println("found unit! UIx = " + unitsTile.getUiX() + "UIy = " + unitsTile.getUiY() + " x = " + unitsTile.getX() + " y = " + unitsTile.getY());
                }
            }
        } else if (this.duel.getSelectedUnit() != null) {
            for (Tile tile : this.duel.getMap().getTiles()) {
                if (tile.getUiX() <= x && tile.getUiX() + 39 >= x && tile.getUiY() + 25 <= y && tile.getUiY() + 65 >= y) {
                    System.out.println("Found Tile! x = " + tile.getUiX() + " y = " + tile.getUiY());
                    this.duel.setSelectedTile(tile); // tarvitaanko tätä mihinkään
                    this.duel.getSelectedUnit().setTile(tile);
                    this.duel.setSelectedUnit(null);
                    this.duel.setSelectedTile(null); // useless?
                    this.duel.setSelectedBuilding(null);
                }
            }
        } 
        
        if (this.duel.getSelectedUnit() == null){
            for (Building building: this.duel.getBuildings().getBuildings()) {
                Tile tile = building.getTile(); 
                if (tile.getUiX() <= x && tile.getUiX() + 39 >= x && tile.getUiY() + 25 <= y && tile.getUiY() + 65 >= y) {
                    System.out.println("Found Building!");
                    this.duel.setSelectedBuilding(building);
                }
            }
        }

        this.component.repaint();

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

}
