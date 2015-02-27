package peli.logic;

import java.util.*;

/**
 * Luokkan tarkoitus on sisältää listaa yhden pelaajan omistamista yksiköistä
 */
public class Army {

    private ArrayList<Unit> units;

    public Army() {
        this.units = new ArrayList<>();
    }

    /**
     * Metodi lisää parametrina annetun yksikön armeijaan
     *
     * @param unit lisättävä yksikkö
     *
     *
     */
    public void addUnit(Unit unit) {
        this.units.add(unit);
    }

    /**
     * Poistaa parametrinan annetun yksikön armeijasta. käytetään esim kun
     * yksikkö kuolee
     *
     * @param unit poistettava yksikkö
     *
     *
     */
    public void removeUnit(Unit unit) {
        this.units.remove(unit);
    }

    public ArrayList<Unit> getUnits() {
        return units;
    }

}
