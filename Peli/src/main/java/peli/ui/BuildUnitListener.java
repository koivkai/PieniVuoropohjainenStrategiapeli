package peli.ui;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import peli.logic.Duel;
import peli.logic.Player;
import peli.logic.TileType;
import peli.logic.Unit;

public class BuildUnitListener implements ActionListener {

    private Container container;
    private Duel duel;

    public BuildUnitListener(Duel duel, Container container) {
        this.container = container;
        this.duel = duel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Build!");

        Player player = null;

        if (this.duel.getPlayerWhoseTurnItIs() == this.duel.getPlayer1()) {
            player = this.duel.getPlayer1();
        } else {
            player = this.duel.getPlayer2();
        }

        if (this.duel.getSelectedBuilding() != null && (this.duel.getSelectedBuilding().getTile().getType() == TileType.OUTPOSTNEUTRAL || this.duel.getSelectedBuilding().getTile().getType() == TileType.REDHQ || this.duel.getSelectedBuilding().getTile().getType() == TileType.BLUEHQ) && this.duel.getSelectedBuilding().getPlayer() == player) {
            Unit unit = new Unit(3, 0.2, 5.0, 20.0, this.duel.getSelectedBuilding().getTile(), "Spearman", player);
            player.addUnit(unit);
        }

        container.repaint();
    }

}
