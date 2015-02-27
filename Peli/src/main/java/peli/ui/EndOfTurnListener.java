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

    private Game duel;

    public EndOfTurnListener(Game duel) {
        this.duel = duel;
    }

    /**
     * Metodi vaihtaa kenen vuoro on. Metodi nollaa liikkumet ja rakentamiset,
     * jotta en vuoralla voi taas liikkua ja rakentaa. Metodi myös nollaa
     * valinnat.
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        Player p1 = this.duel.getPlayer1();
        Player p2 = this.duel.getPlayer2();

        this.duel.setSelectedBuilding(null);
        this.duel.setSelectedUnit(null);
        this.duel.setSelectedTile(null);

        if (this.duel.getPlayerWhoseTurnItIs() == p1) {
            this.duel.setPlayerWhoseTurnItIs(p2);
        } else if (this.duel.getPlayerWhoseTurnItIs() == p2) {
            this.duel.setPlayerWhoseTurnItIs(p1);
        }

        for (Unit unit : this.duel.getPlayer1().getArmy().getUnits()) {
            unit.setHasMoved(false);
            unit.setHasAttacked(false);
        }

        for (Unit unit : this.duel.getPlayer2().getArmy().getUnits()) {
            unit.setHasMoved(false);
            unit.setHasAttacked(false);
        }

        for (Building building : this.duel.getBuildings().getBuildings()) {
            building.setHasBuild(false);
        }

        System.out.println("End OF Turn!");
    }

}
