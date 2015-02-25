

package peli.ui; 

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import peli.logic.Duel;

 
public class AttackListener implements ActionListener {
    
    private Duel duel;
    private Component component;

    public AttackListener(Duel duel, Component component) {
        this.duel = duel;
        this.component = component;
    }
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        
        System.out.println("Attack!");
        
        
        this.component.repaint();
    }

   

} 