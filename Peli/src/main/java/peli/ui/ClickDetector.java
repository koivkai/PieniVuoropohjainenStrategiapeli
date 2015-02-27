package peli.ui;

import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import peli.logic.Army;
import peli.logic.Building;
import peli.logic.Game;
import peli.logic.Tile;
import peli.logic.Unit;

/**
 * Luokka hoitaa asioiden kuten yksikköjen valitsemisen.
 */
public class ClickDetector implements MouseListener {

    private Game duel;
    private Component component;

    public ClickDetector(Game duel, Component component) {
        this.duel = duel;
        this.component = component;
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    /**
     * Metodi hoitaa yksiköiden valitsemista ja liikuttamista ja rakennusten
     * valitsemista. Medoti toimii kontekstiaalisesti sen mukaan mitä on on jo
     * valittuna.(Jos yksikkö on valittu tiilen valitseminen johtaa liikeeseen)
     * Metodi tarkistaa että halutussa liikkumis kohteessa ei ole toista
     * yksikköä ja että se on yksikön liikkuma-matkan sisällä.
     */
    @Override
    public void mousePressed(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        System.out.println(x);
        System.out.println(y);

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
                    boolean tileIsFree = true;

                    for (Unit unit : this.duel.getPlayer1().getArmy().getUnits()) { // estää siirtymisen olemassa olevien unittien päälle.
                        Tile unitTile = unit.getTile();
                        if (unitTile == tile) {
                            tileIsFree = false;
                        }
                    }

                    for (Unit unit : this.duel.getPlayer2().getArmy().getUnits()) { // estää siirtymisen olemassa olevien unittien päälle.
                        Tile unitTile = unit.getTile();
                        if (unitTile == tile) {
                            tileIsFree = false;
                        }
                    }

                    int unitX = this.duel.getSelectedUnit().getTile().getX();
                    int unitY = this.duel.getSelectedUnit().getTile().getY();

                    int tileX = tile.getX();
                    int tileY = tile.getY();

                    int xDif = 0;
                    int yDif = 0;

                    if (unitX >= tileX) {
                        xDif = unitX - tileX;
                    } else {
                        xDif = tileX - unitX;
                    }

                    if (unitY >= tileY) {
                        yDif = unitY - tileY;
                    } else {
                        yDif = tileY - unitY;
                    }

                    int totalDif = xDif + yDif;

                    if (tileIsFree && totalDif <= this.duel.getSelectedUnit().getMP() && !this.duel.getSelectedUnit().getHasMoved()) {
                        this.duel.getSelectedUnit().setTile(tile);
                        this.duel.getSelectedUnit().setHasMoved(true);
                    }

                    this.duel.setSelectedTile(tile); // tarvitaanko tätä mihinkään
                    this.duel.setSelectedUnit(null);
                    this.duel.setSelectedTile(null); // herp a derp
                    this.duel.setSelectedBuilding(null);
                }
            }
        }

        if (this.duel.getSelectedUnit() == null) {
            for (Building building : this.duel.getBuildings().getBuildings()) {
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
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

}
