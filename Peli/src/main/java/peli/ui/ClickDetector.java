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

    private Game game;
    private Component component;

    /**
     * ClickdDtector konstruktori.
     *
     *
     * @param game 
     * @param component tarvitaan repaint varten, mutta tarvitaanko repaint.
     */
    public ClickDetector(Game game, Component component) {
        this.game = game;
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

        if (this.game.getPlayerWhoseTurnItIs() == this.game.getPlayer1()) {
            army = this.game.getPlayer1().getArmy();
        } else {
            army = this.game.getPlayer2().getArmy();
        }

        if (this.game.getSelectedUnit() == null) {
            for (Unit unit : army.getUnits()) {
                Tile unitsTile = unit.getTile();
                if (unitsTile.getUiX() <= x && unitsTile.getUiX() + 39 >= x && unitsTile.getUiY() + 25 <= y && unitsTile.getUiY() + 65 >= y) {

                    this.game.setSelectedUnit(unit);
                    this.game.setSelectedTile(null);
                    this.game.setSelectedBuilding(null);

                    System.out.println("found unit! UIx = " + unitsTile.getUiX() + "UIy = " + unitsTile.getUiY() + " x = " + unitsTile.getX() + " y = " + unitsTile.getY());
                }
            }
        } else if (this.game.getSelectedUnit() != null) {
            for (Tile tile : this.game.getMap().getTiles()) {
                if (tile.getUiX() <= x && tile.getUiX() + 39 >= x && tile.getUiY() + 25 <= y && tile.getUiY() + 65 >= y) {
                    System.out.println("Found Tile! x = " + tile.getUiX() + " y = " + tile.getUiY());
                    boolean tileIsFree = true;

                    for (Unit unit : this.game.getPlayer1().getArmy().getUnits()) { // estää siirtymisen olemassa olevien unittien päälle.
                        Tile unitTile = unit.getTile();
                        if (unitTile == tile) {
                            tileIsFree = false;
                        }
                    }

                    for (Unit unit : this.game.getPlayer2().getArmy().getUnits()) { // estää siirtymisen olemassa olevien unittien päälle.
                        Tile unitTile = unit.getTile();
                        if (unitTile == tile) {
                            tileIsFree = false;
                        }
                    }

                    int unitX = this.game.getSelectedUnit().getTile().getX();
                    int unitY = this.game.getSelectedUnit().getTile().getY();

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

                    if (tileIsFree && totalDif <= this.game.getSelectedUnit().getMP() && !this.game.getSelectedUnit().getHasMoved()) {
                        this.game.getSelectedUnit().setTile(tile);
                        this.game.getSelectedUnit().setHasMoved(true);
                    }

                    this.game.setSelectedTile(tile); // tarvitaanko tätä mihinkään
                    this.game.setSelectedUnit(null);
                    this.game.setSelectedTile(null); // herp a derp
                    this.game.setSelectedBuilding(null);
                }
            }
        }

        if (this.game.getSelectedUnit() == null) {
            for (Building building : this.game.getBuildings().getBuildings()) {
                Tile tile = building.getTile();
                if (tile.getUiX() <= x && tile.getUiX() + 39 >= x && tile.getUiY() + 25 <= y && tile.getUiY() + 65 >= y) {
                    System.out.println("Found Building!");
                    this.game.setSelectedBuilding(building);
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
