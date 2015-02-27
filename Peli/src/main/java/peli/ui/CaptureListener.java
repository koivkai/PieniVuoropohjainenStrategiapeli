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

    private Game game;
    private Component component;

    /**
     * CaptureListener luokan konstruktori.
     *
     *
     * @param game
     * @param component tarvitaan repaint varten
     */
    public CaptureListener(Game game, Component component) {
        this.game = game;
        this.component = component;
    }

    /**
     * Metodi tarkistaa onko valitun yksikön alla rakennusta, jos on rakennus
     * tulee valloitetuksi yksiköä hallitsevalle pelaajalle.
     *
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e) {

        if (this.game.getSelectedUnit() != null) {
            Unit unit = this.game.getSelectedUnit();

            for (Building building : this.game.getBuildings().getBuildings()) {
                if (building.getTile() == unit.getTile()) {
                    building.setPlayer(this.game.getPlayerWhoseTurnItIs());
                    System.out.println("Capture success!");
                    if (building.getTile().getType() == TileType.REDHQ && this.game.getPlayerWhoseTurnItIs() == this.game.getPlayer1()) {
                        this.game.setWinner(this.game.getPlayer1());
                    } else if (building.getTile().getType() == TileType.BLUEHQ && this.game.getPlayerWhoseTurnItIs() == this.game.getPlayer2()) {
                        this.game.setWinner(this.game.getPlayer2());
                    }
                }
            }
        }

        this.component.repaint();
    }

}
