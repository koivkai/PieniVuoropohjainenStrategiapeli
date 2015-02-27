package peli.logic;

import javax.swing.SwingUtilities;
import peli.ui.UserInterface;

public class Game {

    public Game() {
    }

    public void play() {
        Player p1 = new HumanPlayer();
        Player p2 = new HumanPlayer();

        Duel duel = new Duel(p1, p2);
        duel.setUpScenario();


        UserInterface ui = new UserInterface(duel);

        SwingUtilities.invokeLater(ui);
    }

}
