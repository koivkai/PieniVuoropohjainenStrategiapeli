package peli.ui;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import peli.logic.Building;
import peli.logic.Game;
import peli.logic.Tile;
import peli.logic.TileType;
import peli.logic.Unit;

/**
 * Luokka hoitaa capture napin toiminnallisuuden. Eli mahdollistaa rakennusten
 * valloittamisen.
 */
public class CaptureListener implements ActionListener {

    private Game duel;
    private Component component;

    public CaptureListener(Game duel, Component component) {
        this.duel = duel;
        this.component = component;
    }

    /**
     * Metodi tarkistaa onko valitun yksikön alla rakennusta, jos on rakennus
     * tulee valloitetuksi yksiköä hallitsevalle pelaajalle.
     */
    @Override
    public void actionPerformed(ActionEvent e) {

        if (this.duel.getSelectedUnit() != null) {
            Unit unit = this.duel.getSelectedUnit();

            for (Building building : this.duel.getBuildings().getBuildings()) {
                if (building.getTile() == unit.getTile()) {
                    building.setPlayer(this.duel.getPlayerWhoseTurnItIs());
                    System.out.println("Capture success!");
                    if (building.getTile().getType() == TileType.REDHQ && this.duel.getPlayerWhoseTurnItIs() == this.duel.getPlayer1()) {
                        this.duel.setWinner(this.duel.getPlayer1());
                    } else if (building.getTile().getType() == TileType.BLUEHQ && this.duel.getPlayerWhoseTurnItIs() == this.duel.getPlayer2()) {
                        this.duel.setWinner(this.duel.getPlayer2());
                    }
                }
            }
        }

        this.component.repaint();
    }

}
