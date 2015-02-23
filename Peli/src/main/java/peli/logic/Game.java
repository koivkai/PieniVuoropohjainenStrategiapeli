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
        
        Unit unit = new Unit(3, 0.2, 5.0, 20.0, duel.getMap().getTiles().get(5), "Spearman");
        Unit unit2 = new Unit(3, 0.2, 5.0, 20.0, duel.getMap().getTiles().get(4), "Spearman");
        
        p1.addUnit(unit);
        p2.addUnit(unit2);
        
        

        UserInterface ui = new UserInterface(duel);

        SwingUtilities.invokeLater(ui);
    }

    

}
