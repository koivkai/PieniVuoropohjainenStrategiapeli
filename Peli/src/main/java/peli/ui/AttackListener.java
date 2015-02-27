package peli.ui;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import peli.logic.Game;
import peli.logic.Player;
import peli.logic.Unit;

public class AttackListener implements ActionListener {

    private Game duel;
    private Component component;

    /**
     * Luokka hoitaa yksiköiden hyökkäämisen toisiaan vastaan. Se on Attack
     * nappi listener.
     */
    public AttackListener(Game duel, Component component) {
        this.duel = duel;
        this.component = component;
    }

    /**
     * Metodi tarkistaa onko valitun yksikön ympärillä vastustajan yksikköjä.
     * Jos on yksikkö hyökkää kaikkiin sen vieressä oleviin vastustajan
     * yksiköihin. tarkistaa myös että yksikkö hyökkää vain kerran vuorossa.
     *
     *
     */
    @Override
    public void actionPerformed(ActionEvent e) {

        if (this.duel.getSelectedUnit() != null && this.duel.getSelectedUnit().getPlayer() == this.duel.getPlayerWhoseTurnItIs()) {
            Player opponent = this.duel.getPlayer1();

            if (this.duel.getPlayerWhoseTurnItIs() == this.duel.getPlayer1()) {
                opponent = this.duel.getPlayer2();
            }

            Unit attacker = this.duel.getSelectedUnit();
            int x = attacker.getTile().getX();
            int y = attacker.getTile().getY();

            for (Unit enemy : opponent.getArmy().getUnits()) {
                int enemyX = enemy.getTile().getX();
                int enemyY = enemy.getTile().getY();

                if (((x == enemyX && (y + 1 == enemyY || y - 1 == enemyY)) || (y == enemyY && (x + 1 == enemyX || x - 1 == enemyX))) && !attacker.getHasAttacked()) {
                    attacker.setHasAttacked(true);
                    attacker.attack(enemy);
                    System.out.println("Attack!");
                }
            }
        }

        this.component.repaint();
    }

}
