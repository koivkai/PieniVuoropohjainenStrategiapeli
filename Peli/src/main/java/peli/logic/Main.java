/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peli.logic;

import java.util.ArrayList;
import peli.ui.UserInterface;
import javax.swing.SwingUtilities;

/**
 *
 * @author Kaius
 */
public class Main {
    public static void main(String[] args) {
        
        Player p1 = new HumanPlayer();
        Player p2 = new HumanPlayer();
        
        Duel duel = new Duel(p1, p2);
        duel.setUpScenario();
        
        
       int x = duel.getMap().getTiles().size();
        System.out.println(x);
        
        System.out.println(duel.getMap().getTiles().get(0).getType());
        
        UserInterface ui = new UserInterface(duel);
        
        SwingUtilities.invokeLater(ui);
    }
    
    
}
