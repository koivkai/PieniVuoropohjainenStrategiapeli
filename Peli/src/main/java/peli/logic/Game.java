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

        Unit unit = new Unit(3, 0.2, 15.0, 20.0, duel.getMap().getTiles().get(5), "Spearman", p1);
        Unit unit2 = new Unit(3, 0.2, 15.0, 20.0, duel.getMap().getTiles().get(60), "Spearman", p2);
        Unit unit3 = new Unit(3, 0.2, 15.0, 20.0, duel.getMap().getTiles().get(93), "Spearman", p1);

        p1.addUnit(unit);
        p2.addUnit(unit2);
        p1.addUnit(unit3);

        UserInterface ui = new UserInterface(duel);

        SwingUtilities.invokeLater(ui);
    }

}
