package peli.logic;

public class HumanPlayer implements Player {

    private Army army;
    private int resources;

    @Override
    public void pelaaVuoro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Army getArmy() {
        return this.army;
    }

}
