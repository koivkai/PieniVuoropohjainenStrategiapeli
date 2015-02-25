

package peli.ui; 

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import peli.logic.Duel;
import peli.logic.Player;

 
public class EndOfTurnListener implements ActionListener{
    
    private Duel duel;

    public EndOfTurnListener(Duel duel) {
        this.duel = duel;
    }
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        Player p1 = this.duel.getPlayer1();
        Player p2 = this.duel.getPlayer2();
        
        if(this.duel.getPlayerWhoseTurnItIs() == p1) {
            this.duel.setPlayerWhoseTurnItIs(p2);
        } else if (this.duel.getPlayerWhoseTurnItIs() == p2) {
            this.duel.setPlayerWhoseTurnItIs(p1);
        }
        System.out.println("End OF Turn!");
    }

   

} 