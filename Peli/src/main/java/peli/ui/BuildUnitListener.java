package peli.ui;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import peli.logic.Game;
import peli.logic.Player;
import peli.logic.TileType;
import peli.logic.Unit;

/**
 * Luokka rakentaa yksikön valittuun rakennukseen. Alunperin tarkoitus oli että
 * yksiköitä olisi monia, ja niistä voisi valita. Yksiköillä oli myös tarkoitus
 * olla resurssi hinta. Aikarajoitusten takia koko juttua täytyi
 * yksinkertaistaa.
 */
public class BuildUnitListener implements ActionListener {

    private Container container;
    private Game duel;

    public BuildUnitListener(Game duel, Container container) {
        this.container = container;
        this.duel = duel;
    }

    /**
     * Metodi rakentaa yksikön valitusta rakennuksesta. Vain 1 yksikkö voidaan
     * rakentaa per rakennus per vuoro. Vain Outposteista ja HQ:sta saa voi
     * rakentaa yksikköjä. Rakennetun yksikön omistaja on pelaaja jonka vuoro
     * on.
     *
     *
     */
    @Override
    public void actionPerformed(ActionEvent e) {

        Player player = null;

        if (this.duel.getPlayerWhoseTurnItIs() == this.duel.getPlayer1()) {
            player = this.duel.getPlayer1();
        } else {
            player = this.duel.getPlayer2();
        }

        if ((this.duel.getSelectedBuilding() != null && (this.duel.getSelectedBuilding().getTile().getType() == TileType.OUTPOSTNEUTRAL || this.duel.getSelectedBuilding().getTile().getType() == TileType.REDHQ || this.duel.getSelectedBuilding().getTile().getType() == TileType.BLUEHQ) && this.duel.getSelectedBuilding().getPlayer() == player) && !this.duel.getSelectedBuilding().getHasBuild()) {
            Unit unit = new Unit(3, 0.2, 15.0, 20.0, this.duel.getSelectedBuilding().getTile(), "Spearman", player);
            player.addUnit(unit);
            this.duel.getSelectedBuilding().setHasBuild(true);
            System.out.println("Build!");
        }

        container.repaint();
    }

}
