package peli.logic;

public class HumanPlayer implements Player {

    private Army army;
    private int resources;

    @Override
    public void pelaaVuoro() {
        
    }

    @Override
    public Army getArmy() {
        return this.army;
    }

    public void setArmy(Army army) {
        this.army = army;
    }
    
    

}
