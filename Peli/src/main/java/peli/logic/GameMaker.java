package peli.logic;

import javax.swing.SwingUtilities;
import peli.ui.UserInterface;

/**
 * Luokka alustaa pelin
 */
public class GameMaker {

    /**
     * GameMaker luokalla on tyhjä konstuktori joka ei tee mitään jännää.
     */
    public GameMaker() {
    }

    /**
     * Metodi luo pelaajat ja pelin ja laittaa pelaajat peliin, sekä käynnistää
     * käyttöliittymän.
     *
     *
     */
    public void makeANewGame() {
        Player p1 = new HumanPlayer();
        Player p2 = new HumanPlayer();

        Game duel = new Game(p1, p2);
        duel.setUpScenario();

        UserInterface ui = new UserInterface(duel);

        SwingUtilities.invokeLater(ui);
    }

}
