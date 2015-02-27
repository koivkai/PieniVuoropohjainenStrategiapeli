package peli.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import peli.logic.Building;
import peli.logic.Game;
import peli.logic.Player;
import peli.logic.Unit;

/**
 * Luokka hoitaa End Turn -napin toiminnallisuuden.
 */
public class EndOfTurnListener implements ActionListener {

    private Game game;

    /**
     * EndOfTurnListener konstruktori.
     *
     *
     * @param game
     */
    public EndOfTurnListener(Game game) {
        this.game = game;
    }

    /**
     * Metodi vaihtaa kenen vuoro on. Metodi nollaa liikkumet ja rakentamiset,
     * jotta en vuoralla voi taas liikkua ja rakentaa. Metodi myös nollaa
     * valinnat.
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        Player p1 = this.game.getPlayer1();
        Player p2 = this.game.getPlayer2();

        this.game.setSelectedBuilding(null);
        this.game.setSelectedUnit(null);
        this.game.setSelectedTile(null);

        if (this.game.getPlayerWhoseTurnItIs() == p1) {
            this.game.setPlayerWhoseTurnItIs(p2);
        } else if (this.game.getPlayerWhoseTurnItIs() == p2) {
            this.game.setPlayerWhoseTurnItIs(p1);
        }

        for (Unit unit : this.game.getPlayer1().getArmy().getUnits()) {
            unit.setHasMoved(false);
            unit.setHasAttacked(false);
        }

        for (Unit unit : this.game.getPlayer2().getArmy().getUnits()) {
            unit.setHasMoved(false);
            unit.setHasAttacked(false);
        }

        for (Building building : this.game.getBuildings().getBuildings()) {
            building.setHasBuild(false);
        }

        System.out.println("End OF Turn!");
    }

}
