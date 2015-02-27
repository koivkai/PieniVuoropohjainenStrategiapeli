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
    private Game game;

    /**
     * BuildUnitListener konstruktori
     *
     *
     * @param game peli johon kaikki liittyy
     * @param container tarvitaan repaint varten
     */
    public BuildUnitListener(Game game, Container container) {
        this.container = container;
        this.game = game;
    }

    /**
     * Metodi rakentaa yksikön valitusta rakennuksesta. Vain 1 yksikkö voidaan
     * rakentaa per rakennus per vuoro. Vain Outposteista ja HQ:sta saa voi
     * rakentaa yksikköjä. Rakennetun yksikön omistaja on pelaaja jonka vuoro
     * on.
     *
     *
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e) {

        Player player = null;

        if (this.game.getPlayerWhoseTurnItIs() == this.game.getPlayer1()) {
            player = this.game.getPlayer1();
        } else {
            player = this.game.getPlayer2();
        }

        if ((this.game.getSelectedBuilding() != null && (this.game.getSelectedBuilding().getTile().getType() == TileType.OUTPOSTNEUTRAL || this.game.getSelectedBuilding().getTile().getType() == TileType.REDHQ || this.game.getSelectedBuilding().getTile().getType() == TileType.BLUEHQ) && this.game.getSelectedBuilding().getPlayer() == player) && !this.game.getSelectedBuilding().getHasBuild()) {
            Unit unit = new Unit(3, 0.2, 15.0, 20.0, this.game.getSelectedBuilding().getTile(), "Spearman", player);
            player.addUnit(unit);
            this.game.getSelectedBuilding().setHasBuild(true);
            System.out.println("Build!");
        }

        container.repaint();
    }

}
